package com.kevalpatel2106.blockchain.info.dashboard

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.kevalpatel2106.blockchain.info.bin.Transaction

class TransactionsAdapter(private val onLoadMore: () -> Unit) :
        ListAdapter<Transaction, RootViewHolder>(D