/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;

public class RNMBXCameraManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNMBXCameraManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public RNMBXCameraManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "maxBounds":
        mViewManager.setMaxBounds(view, new DynamicFromObject(value));
        break;
      case "animationDuration":
        mViewManager.setAnimationDuration(view, new DynamicFromObject(value));
        break;
      case "animationMode":
        mViewManager.setAnimationMode(view, new DynamicFromObject(value));
        break;
      case "defaultStop":
        mViewManager.setDefaultStop(view, new DynamicFromObject(value));
        break;
      case "userTrackingMode":
        mViewManager.setUserTrackingMode(view, new DynamicFromObject(value));
        break;
      case "followUserLocation":
        mViewManager.setFollowUserLocation(view, new DynamicFromObject(value));
        break;
      case "followUserMode":
        mViewManager.setFollowUserMode(view, new DynamicFromObject(value));
        break;
      case "followZoomLevel":
        mViewManager.setFollowZoomLevel(view, new DynamicFromObject(value));
        break;
      case "followPitch":
        mViewManager.setFollowPitch(view, new DynamicFromObject(value));
        break;
      case "followHeading":
        mViewManager.setFollowHeading(view, new DynamicFromObject(value));
        break;
      case "followPadding":
        mViewManager.setFollowPadding(view, new DynamicFromObject(value));
        break;
      case "zoomLevel":
        mViewManager.setZoomLevel(view, new DynamicFromObject(value));
        break;
      case "maxZoomLevel":
        mViewManager.setMaxZoomLevel(view, new DynamicFromObject(value));
        break;
      case "minZoomLevel":
        mViewManager.setMinZoomLevel(view, new DynamicFromObject(value));
        break;
      case "stop":
        mViewManager.setStop(view, new DynamicFromObject(value));
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
