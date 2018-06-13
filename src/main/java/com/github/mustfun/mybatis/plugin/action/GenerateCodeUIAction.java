package com.github.mustfun.mybatis.plugin.action;

import com.github.mustfun.mybatis.plugin.setting.ConnectDbSetting;
import com.github.mustfun.mybatis.plugin.ui.custom.DialogWrapperPanel;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

/**
 * @author dengzhiyuan
 * @version 1.0
 * @date 2018/6/12
 * @since 1.0
 */
public class GenerateCodeUIAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        ConnectDbSetting connectDbSetting = new ConnectDbSetting();

        DialogWrapperPanel dialogWrapperPanel = new DialogWrapperPanel(project,true,connectDbSetting);
        dialogWrapperPanel.show();
    }

}
