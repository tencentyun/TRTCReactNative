package com.trtcreactnativesdk.view;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.rtmp.ui.TXCloudVideoView;

/**
 * @Description TODO
 * @Author martin
 * @Date 2020-09-18 17:04
 */
public class TXVideoViewManager extends SimpleViewManager<TXVideoView> {
    public static final String REACT_CLASS = "TXVideoView";
    public TXCloudVideoView videoView;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected TXVideoView createViewInstance(ThemedReactContext reactContext) {
        return new TXVideoView(reactContext);
    }
    @Override
    public void onDropViewInstance(TXVideoView trtcVideoView) {
        super.onDropViewInstance(trtcVideoView);
        trtcVideoView.stopPlayView();
    }
    @ReactProp(name = "renderMode")
    public void setRenderMode(final TXVideoView trtcVideoView, int renderMode) {
        trtcVideoView.setRenderMode(renderMode);
    }
    @ReactProp(name = "mirrorMode")
    public void setMirrorMode(final TXVideoView trtcVideoView, int mirrorMode) {
        trtcVideoView.setMirrorMode(mirrorMode);
    }
    @ReactProp(name = "uid")
    public void setUid(final TXVideoView trtcVideoView, final String uid) {
        trtcVideoView.setUid(uid);
    }
}
