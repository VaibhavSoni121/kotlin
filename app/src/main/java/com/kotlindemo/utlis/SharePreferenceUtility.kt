package com.kotlindemo.utlis

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

/**
 * This class used for handling shared preferences in application.
 * @author Vaibhav
 * @version 1.0
 * @since 2017-12-07
 */
class SharePreferenceUtility {
    private var mEditor: Editor? = null

    /**
     * Put long value into sharedpreference
     */
    fun putLong(key: String, value: Long) {
        try {
            mEditor = mPref!!.edit()
            mEditor!!.putLong(key, value)
            mEditor!!.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /**
     * Get long value from sharedpreference
     */
    fun getLong(key: String): Long {
        try {
            val lvalue: Long
            lvalue = mPref!!.getLong(key, 0)
            return lvalue
        } catch (e: Exception) {
            e.printStackTrace()
            return 0
        }

    }

    /**
     * Put int value into sharedpreference
     */
    fun putInt(key: String, value: Int) {
        try {
            mEditor = mPref!!.edit()
            mEditor!!.putInt(key, value)
            mEditor!!.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /**
     * Get int value from sharedpreference
     */
    fun getInt(key: String): Int {
        try {
            val lvalue: Int
            lvalue = mPref!!.getInt(key, 0)
            return lvalue
        } catch (e: Exception) {
            e.printStackTrace()
            return 0
        }

    }

    /**
     * Put String value into sharedpreference
     */
    fun putString(key: String, value: String) {
        try {
            mEditor = mPref!!.edit()
            mEditor!!.putString(key, value)
            mEditor!!.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /**
     * Get String value from sharedpreference
     */
    fun getString(key: String): String {
        try {
            val lvalue: String?
            lvalue = mPref!!.getString(key, "")
            return lvalue
        } catch (e: Exception) {
            e.printStackTrace()
            return ""
        }

    }

    /**
     * Put String value into sharedpreference
     */
    fun putBoolean(key: String, value: Boolean?) {
        try {
            mEditor = mPref!!.edit()
            mEditor!!.putBoolean(key, value!!)
            mEditor!!.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /**
     * Get String value from sharedpreference
     */
    fun getBoolean(key: String): Boolean? {
        try {
            val lvalue: Boolean?
            lvalue = mPref!!.getBoolean(key, false)
            return lvalue
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }

    }

    companion object {

        private var mPref: SharedPreferences? = null
        private var mRef: SharePreferenceUtility? = null

        /**
         * Singleton method return the instance
         */
        fun getInstance(context: Context): SharePreferenceUtility {
            if (mRef == null) {
                mRef = SharePreferenceUtility()
                mPref = context.applicationContext.getSharedPreferences(
                        "MyPref", 0)
                return mRef as SharePreferenceUtility
            }
            return mRef as SharePreferenceUtility
        }
    }

}
