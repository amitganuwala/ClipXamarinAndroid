package md5acc54a6ea3c5f2d688696540e0f6a967;


public class GetProfileDetails_btnFollowingClickListner_postCancelFriendRequest
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPreExecute:()V:GetOnPreExecuteHandler\n" +
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("WeClip.Droid.AsyncTask.GetProfileDetails+btnFollowingClickListner+postCancelFriendRequest, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", GetProfileDetails_btnFollowingClickListner_postCancelFriendRequest.class, __md_methods);
	}


	public GetProfileDetails_btnFollowingClickListner_postCancelFriendRequest () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GetProfileDetails_btnFollowingClickListner_postCancelFriendRequest.class)
			mono.android.TypeManager.Activate ("WeClip.Droid.AsyncTask.GetProfileDetails+btnFollowingClickListner+postCancelFriendRequest, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPreExecute ()
	{
		n_onPreExecute ();
	}

	private native void n_onPreExecute ();


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);


	public void onPostExecute (java.lang.Object p0)
	{
		n_onPostExecute (p0);
	}

	private native void n_onPostExecute (java.lang.Object p0);

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
