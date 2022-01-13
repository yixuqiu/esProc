package com.scudata.ide.starter;

import java.awt.event.ActionEvent;

import com.scudata.app.config.ConfigUtil;
import com.scudata.ide.common.ConfigMenuAction;
import com.scudata.ide.common.GM;

public class OpenActionListener extends ConfigMenuAction {

	public void actionPerformed(ActionEvent event) {
		try {
			String path = this.getConfigArgument();
			String startHome = System.getProperty("start.home");// ���ϵͳ��Ŀ¼
			path = ConfigUtil.getPath(startHome, path);
			Runtime.getRuntime().exec("cmd /c \"" + path + "\"");
		} catch (Exception e) {
			GM.showException(e);
		}

	}

}