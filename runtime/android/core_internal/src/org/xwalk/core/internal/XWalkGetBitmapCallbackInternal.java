// Copyright (c) 2013 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.core.internal;

import android.graphics.Bitmap;

/**
 * A callback interface for content readback into a bitmap.
 */
@XWalkAPI(createExternally = true)
public abstract class XWalkGetBitmapCallbackInternal {
    /**
     * Constructor for download listener.
     * @param context  a Context object.
     * @since 6.0
     */
    @XWalkAPI
    public XWalkGetBitmapCallbackInternal() {}

    /**
     * Called when the content readback finishes.
     * @param bitmap     The {@link Bitmap} of the content.  Null will be passed for readback
     *                   failure.
     * @param response 0 for success, others failure.
     * @since 6.0
     */
    @XWalkAPI
    public abstract void onFinishGetBitmap(Bitmap bitmap, int response);

}
