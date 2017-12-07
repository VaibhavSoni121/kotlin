package com.kotlindemo.utlis


import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast

/**
 * TO check if Internet connection is available or not.
 * @author Vaibhav
 */
object NetworkAvailablity {

    var mRefrence: NetworkAvailablity? = null

    val instance: NetworkAvailablity
        get() {
            if (null == mRefrence)
                mRefrence = NetworkAvailablity
            return mRefrence as NetworkAvailablity
        }

    /**
     * Check network availability
     */
    fun checkNetworkStatus(context: Context): Boolean {
        try {


            var HaveConnectedWifi = false
            var HaveConnectedMobile = false
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.allNetworkInfo
            for (ni in netInfo) {
                if (ni.typeName.equals("Wifi", true))
                    if (ni.isConnected)
                        HaveConnectedWifi = true
                if (ni.typeName.equals("MOBILE", ignoreCase = true))
                    if (ni.isConnected)
                        HaveConnectedMobile = true
            }
            if (!HaveConnectedWifi && !HaveConnectedMobile) {
                Toast.makeText(context, "Internet Connection Not Available", Toast.LENGTH_SHORT).show()
            }
            return HaveConnectedWifi || HaveConnectedMobile
        } catch (e: Exception) {
            return false
        }

    }


}

