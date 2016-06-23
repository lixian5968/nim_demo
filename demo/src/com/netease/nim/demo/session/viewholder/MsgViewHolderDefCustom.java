package com.netease.nim.demo.session.viewholder;

import com.netease.nim.demo.session.extension.DefaultCustomAttachment;
import com.netease.nim.demo.session.extension.Lx2CustomAttachment;
import com.netease.nim.uikit.session.viewholder.MsgViewHolderText;

/**
 * Created by zhoujianghua on 2015/8/4.
 */
public class MsgViewHolderDefCustom extends MsgViewHolderText {

    @Override
    protected String getDisplayText() {
        if(message.getAttachment() instanceof  Lx2CustomAttachment){
            Lx2CustomAttachment attachment = (Lx2CustomAttachment) message.getAttachment();
//            attachment.parseData();
//            return  attachment.getContent();
            return  "哈哈哈";
        }else{
            DefaultCustomAttachment attachment = (DefaultCustomAttachment) message.getAttachment();
            return "type: " + attachment.getType() + ", data: " + attachment.getContent();
        }

    }
}
