import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;
    private String equ = ""; // значение посчитанного выражения

    public ActionButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        // если в строке есть знак "=", значит в памяти уже готовый расчёт, и предварительно его удаляем
        if ( outField.getText().indexOf('=')!= -1) {
            outField.setText("");
        }
        // если нажата "Delete"
        if (jButton.getText() == "Delete") {
            StringBuffer s = new StringBuffer(outField.getText());
            outField.setText(String.valueOf(s.deleteCharAt(s.length()-1)));
            return;
        }
        // если нажата "Clear"
        if (jButton.getText() == "Clear") {
            outField.setText("");
            return;
        }
        // если нажата "=" - высчитываем что получаетя, и результат прописываем в "значение посчитанного выражения"
        if (jButton.getText() == "=") {
            try {
                equ = toCount(outField.getText().toString());
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }
            }
        /** если ничего "специального" не нажато, - просто собираем в строку какие кнопки были нажаты
         *  туда же прописываем и результат-"значение посчитанного выражения", но пока он не посчитан, - он "пустота"
         */
        String val = sb.append(outField.getText())
                .append(jButton.getText()).append(equ)
                .toString();
        outField.setText(val);
        sb.setLength(0);
        equ = "";
    }

    // рассчёт имеющегося выражения
    private String toCount (String e) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult = scriptEngine.eval(e);
        return String.valueOf(expResult);
    }


}
