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

public final class CurveHolder extends Ice.ObjectHolderBase<Curve>
{
    public
    CurveHolder()
    {
    }

    public
    CurveHolder(Curve value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof Curve)
        {
            value = (Curve)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _CurveDisp.ice_staticId();
    }
}
