// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `Curve.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public abstract class Callback_Curve_getDiscount
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackFloat
{
    public final void __completed(Ice.AsyncResult __result)
    {
        CurvePrxHelper.__getDiscount_completed(this, __result);
    }
}
