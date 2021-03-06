package com.jungh0.w3w_map.ui.main;

import android.app.Dialog;
import android.graphics.Bitmap;

import com.pepperonas.materialdialog.MaterialDialog;
import com.pepperonas.materialdialog.model.LicenseInfo;

import org.aviran.cookiebar2.OnActionClickListener;

import java.util.List;

public class MainContract {

    interface View{

        void showMaterialDialog(String str, String str2);

        void showMaterialDialogLicenseInfo();

        String getresource(int rid);

        void showMaterialDialogSearch(MaterialDialog.ShowListener listener);

        void showMaterialDialogShare(MaterialDialog.ShowListener listener);

        void showSelectMethod(MaterialDialog.ItemClickListener listener);

        void clip_copy(String m);

        void ToastMD(String str,int num);

        void make_cookie(String title, String message, String cancel_str, OnActionClickListener onActionClickListener);

        void startService(String codee,int first_move);

        void stopService();

        void close_drawer();

        void change_login_info(Bitmap bit, String txt);

        void showMaterialDialog_listen(String str, String str2,MaterialDialog.ButtonCallback listener);

        void showMaterialDialogLogin(MaterialDialog.ShowListener listener);

        void open_drawer();

        void showMaterialDialogLoading(Dialog.OnShowListener listener);

        void showMaterialDialogList(final String[] list);

        void showMaterialDialogList_friend(final String[] list,MaterialDialog.ItemClickListener listenter);

        void go_intent();

    }

    interface Presenter{

        List<LicenseInfo> getLicenseInfos();

        void check_deeplink();

        void makeMaterialDialogSearch(final String s_data);

        void makeMaterialDialogShare();

        void login_();

        void makemyinfo();

        void makefriend();

    }

}
