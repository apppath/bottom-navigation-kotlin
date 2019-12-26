package com.basic.programming.mykittyormapp.appfragments

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment
import com.sdsmdg.tastytoast.TastyToast

class ShireFragment : ListFragment() {

    private var itemList = arrayOf(
        "MS-Windows",
        "Ubuntu",
        "Mac OS",
        "Fedora",
        "Solaris",
        "Free BSD",
        "Chrome OS",
        "CentOS",
        "Debian",
        "Deepin"
    );

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, itemList)
        listAdapter = arrayAdapter
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        val items = listAdapter?.getItem(position) as String

        TastyToast.makeText(
            activity, items,
            TastyToast.LENGTH_LONG,
            TastyToast.SUCCESS
        ).show();
    }

}
