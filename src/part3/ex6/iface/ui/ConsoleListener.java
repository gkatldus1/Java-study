package part3.ex6.iface.ui;

import part3.ex6.iface.entity.Exam;

public interface ConsoleListener {

	void onPrint(Exam exam);

	void onInput(Exam exam);

}
