package com.trtcreactnativesdk.view;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.rtmp.ui.TXCloudVideoView;

/**
 * @Description 视频渲染控制器
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
        System.out.println("stopview===");
        super.onDropViewInstance(trtcVideoView);
        trtcVideoView.stopPlayView();
    }
    @ReactProp(name = "renderMode")
    public void setRenderMode(final TXVideoView trtcVideoView, int renderMode) {
        trtcVideoView.setRenderMode(renderMode);
    }
    @ReactProp(name = "renderParams")
    public void setRenderParams(final TXVideoView trtcVideoView, ReadableMap renderParams) {
        trtcVideoView.setRenderParams(renderParams);
    }
    @ReactProp(name = "data")
    public void startView(final TXVideoView trtcVideoView, ReadableMap data) {
        trtcVideoView.startView(data);
    }
}
