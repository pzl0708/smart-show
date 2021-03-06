package com.coder.zzq.smartshow.dialog.creator.type.impl;

import com.coder.zzq.smartshow.dialog.creator.type.IEnsureDialogCreator;
import com.coder.zzq.smartshow.dialog.creator.type.IInputTextDialogCreator;
import com.coder.zzq.smartshow.dialog.creator.type.ILoadingDialogCreator;
import com.coder.zzq.smartshow.dialog.creator.type.INotificationDialogCreator;

public class DialogCreatorFactory {
    public static INotificationDialogCreator notification() {
        return new NotificationDialogCreator();
    }

    public static IEnsureDialogCreator ensure() {
        return new EnsureDialogCreator();
    }

    public static IInputTextDialogCreator input() {
        return new InputTextDialogCreator();
    }

    public static ILoadingDialogCreator loading() {
        return new LoadingDialogCreator();
    }
}
