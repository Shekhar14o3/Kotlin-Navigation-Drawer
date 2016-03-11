package com.navigationdrawer.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.navigationdrawer.R

/**
 * Created by aman on 6/3/16.
 */
class Fragment_Option_A : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // TODO Auto-generated method stub
        val rootView = inflater!!.inflate(R.layout.fragment_option_a, container, false)
        return rootView
    }
}
