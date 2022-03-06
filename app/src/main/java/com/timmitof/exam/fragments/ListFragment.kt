package com.timmitof.exam.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.exam.App
import com.timmitof.exam.R
import com.timmitof.exam.adapters.HistoryAdapter

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val payments = App.instance?.getDatabase()?.PaymentsDao()?.getAllPayments()
        val recyclerView = view.findViewById<RecyclerView>(R.id.history_recyclerview)
        recyclerView.adapter = HistoryAdapter(payments!!, requireActivity())
    }

}