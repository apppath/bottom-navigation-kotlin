package com.basic.programming.mykittyormapp.appfragments

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment
import com.basic.programming.mykittyormapp.R
import com.sdsmdg.tastytoast.TastyToast


class StarFragment : ListFragment() {


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val values = resources.getStringArray(R.array.star_list)

        var arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            activity!!,
            android.R.layout.simple_list_item_1, values
        )

        listAdapter = arrayAdapter

    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        val flowers = listAdapter?.getItem(position) as String

        TastyToast.makeText(
            activity,
            flowers, TastyToast.LENGTH_LONG,
            TastyToast.SUCCESS
        ).show()
    }
}
