package mypackage;

import java.util.prefs.Preferences;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Preferences pref=Preferences.userNodeForPackage(Main.class);
		pref.put("ID", "Hunter");
		System.out.println("ID:"+pref.get("ID", null));

	}

}
