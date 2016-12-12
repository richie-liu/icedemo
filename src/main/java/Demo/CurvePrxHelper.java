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

/**
 * Provides type-specific helper functions.
 **/
public final class CurvePrxHelper extends Ice.ObjectPrxHelperBase implements CurvePrx
{
    private static final String __getDiscount_name = "getDiscount";

    public float getDiscount(int date)
    {
        return getDiscount(date, null, false);
    }

    public float getDiscount(int date, java.util.Map<String, String> __ctx)
    {
        return getDiscount(date, __ctx, true);
    }

    private float getDiscount(int date, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getDiscount_name);
        return end_getDiscount(begin_getDiscount(date, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getDiscount(int date)
    {
        return begin_getDiscount(date, null, false, false, null);
    }

    public Ice.AsyncResult begin_getDiscount(int date, java.util.Map<String, String> __ctx)
    {
        return begin_getDiscount(date, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getDiscount(int date, Ice.Callback __cb)
    {
        return begin_getDiscount(date, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getDiscount(int date, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getDiscount(date, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getDiscount(int date, Callback_Curve_getDiscount __cb)
    {
        return begin_getDiscount(date, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getDiscount(int date, java.util.Map<String, String> __ctx, Callback_Curve_getDiscount __cb)
    {
        return begin_getDiscount(date, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getDiscount(int date, 
                                             IceInternal.Functional_FloatCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getDiscount(date, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getDiscount(int date, 
                                             IceInternal.Functional_FloatCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getDiscount(date, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getDiscount(int date, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_FloatCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getDiscount(date, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getDiscount(int date, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_FloatCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getDiscount(date, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getDiscount(int date, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_FloatCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getDiscount(date, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackFloat(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             CurvePrxHelper.__getDiscount_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_getDiscount(int date, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getDiscount_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getDiscount_name, __cb);
        try
        {
            __result.prepare(__getDiscount_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(date);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public float end_getDiscount(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getDiscount_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            float __ret;
            __ret = __is.readFloat();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getDiscount_completed(Ice.TwowayCallbackFloat __cb, Ice.AsyncResult __result)
    {
        CurvePrx __proxy = (CurvePrx)__result.getProxy();
        float __ret = (float)0.0;
        try
        {
            __ret = __proxy.end_getDiscount(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __getPillars_name = "getPillars";

    public String[] getPillars()
    {
        return getPillars(null, false);
    }

    public String[] getPillars(java.util.Map<String, String> __ctx)
    {
        return getPillars(__ctx, true);
    }

    private String[] getPillars(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getPillars_name);
        return end_getPillars(begin_getPillars(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getPillars()
    {
        return begin_getPillars(null, false, false, null);
    }

    public Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx)
    {
        return begin_getPillars(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getPillars(Ice.Callback __cb)
    {
        return begin_getPillars(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getPillars(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getPillars(Callback_Curve_getPillars __cb)
    {
        return begin_getPillars(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, Callback_Curve_getPillars __cb)
    {
        return begin_getPillars(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getPillars(IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getPillars(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getPillars(IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getPillars(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getPillars(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getPillars(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getPillars(__ctx, __explicitCtx, __synchronous, 
                                new IceInternal.Functional_TwowayCallbackArg1<String[]>(__responseCb, __exceptionCb, __sentCb)
                                    {
                                        public final void __completed(Ice.AsyncResult __result)
                                        {
                                            CurvePrxHelper.__getPillars_completed(this, __result);
                                        }
                                    });
    }

    private Ice.AsyncResult begin_getPillars(java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getPillars_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getPillars_name, __cb);
        try
        {
            __result.prepare(__getPillars_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String[] end_getPillars(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getPillars_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String[] __ret;
            __ret = PillarsHelper.read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getPillars_completed(Ice.TwowayCallbackArg1<String[]> __cb, Ice.AsyncResult __result)
    {
        CurvePrx __proxy = (CurvePrx)__result.getProxy();
        String[] __ret = null;
        try
        {
            __ret = __proxy.end_getPillars(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __sayCurve_name = "sayCurve";

    public void sayCurve(int delay)
    {
        sayCurve(delay, null, false);
    }

    public void sayCurve(int delay, java.util.Map<String, String> __ctx)
    {
        sayCurve(delay, __ctx, true);
    }

    private void sayCurve(int delay, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_sayCurve(begin_sayCurve(delay, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_sayCurve(int delay)
    {
        return begin_sayCurve(delay, null, false, false, null);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, java.util.Map<String, String> __ctx)
    {
        return begin_sayCurve(delay, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, Ice.Callback __cb)
    {
        return begin_sayCurve(delay, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_sayCurve(delay, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, Callback_Curve_sayCurve __cb)
    {
        return begin_sayCurve(delay, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, java.util.Map<String, String> __ctx, Callback_Curve_sayCurve __cb)
    {
        return begin_sayCurve(delay, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayCurve(delay, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayCurve(delay, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayCurve(delay, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayCurve(int delay, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayCurve(delay, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_sayCurve(int delay, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayCurve(delay, 
                              __ctx, 
                              __explicitCtx, 
                              __synchronous, 
                              new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_sayCurve(int delay, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__sayCurve_name, __cb);
        try
        {
            __result.prepare(__sayCurve_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(delay);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_sayCurve(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __sayCurve_name);
    }

    private static final String __shutdown_name = "shutdown";

    public void shutdown()
    {
        shutdown(null, false);
    }

    public void shutdown(java.util.Map<String, String> __ctx)
    {
        shutdown(__ctx, true);
    }

    private void shutdown(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_shutdown(begin_shutdown(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_shutdown()
    {
        return begin_shutdown(null, false, false, null);
    }

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx)
    {
        return begin_shutdown(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_shutdown(Ice.Callback __cb)
    {
        return begin_shutdown(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_shutdown(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_shutdown(Callback_Curve_shutdown __cb)
    {
        return begin_shutdown(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, Callback_Curve_shutdown __cb)
    {
        return begin_shutdown(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_shutdown(IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_shutdown(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_shutdown(IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_shutdown(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_shutdown(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_shutdown(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_shutdown(__ctx, 
                              __explicitCtx, 
                              __synchronous, 
                              new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__shutdown_name, __cb);
        try
        {
            __result.prepare(__shutdown_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_shutdown(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __shutdown_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CurvePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), CurvePrx.class, CurvePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CurvePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), CurvePrx.class, CurvePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CurvePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), CurvePrx.class, CurvePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CurvePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), CurvePrx.class, CurvePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static CurvePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, CurvePrx.class, CurvePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static CurvePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, CurvePrx.class, CurvePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Demo::Curve",
        "::Ice::Object"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, CurvePrx v)
    {
        __os.writeProxy(v);
    }

    public static CurvePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CurvePrxHelper result = new CurvePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
