package com.ahnlab.vagent.task;

import com.ahnlab.vagent.agent.Agent;
import com.ahnlab.vagent.base.TaskData;
import com.ahnlab.vagent.utils.ServerUtils;

public class EventLogTaskAccess extends EventLogTask{
    @Override
    public void execute(Agent agent, TaskData taskData) {
        TaskActionVO taskActionVO = getTaskActionVO(agent, taskData.getFilePath());
        ServerUtils.sendServer(String.format("%s%s", hostUrl, taskData.getUrl()), taskActionVO.toJsonString());
    }
}
