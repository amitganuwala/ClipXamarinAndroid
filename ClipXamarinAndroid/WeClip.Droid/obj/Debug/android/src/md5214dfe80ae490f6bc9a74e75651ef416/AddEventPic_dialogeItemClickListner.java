package md5214dfe80ae490f6bc9a74e75651ef416;


public class AddEventPic_dialogeItemClickListner
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/content/DialogInterface;I)V:GetOnClick_Landroid_content_DialogInterface_IHandler:Android.Content.IDialogInterfaceOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("WeClip.Droid.AddEventPic+dialogeItemClickListner, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", AddEventPic_dialogeItemClickListner.class, __md_methods);
	}


	public AddEventPic_dialogeItemClickListner () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AddEventPic_dialogeItemClickListner.class)
			mono.android.TypeManager.Activate ("WeClip.Droid.AddEventPic+dialogeItemClickListner, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public AddEventPic_dialogeItemClickListner (md5214dfe80ae490f6bc9a74e75651ef416.AddEventPic p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == AddEventPic_dialogeItemClickListner.class)
			mono.android.TypeManager.Activate ("WeClip.Droid.AddEventPic+dialogeItemClickListner, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "WeClip.Droid.AddEventPic, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onClick (android.content.DialogInterface p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
