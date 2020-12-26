package com.kevalpatel2106.blockchain.info.dashboard

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.MutableLiveData
import com.kevalpatel2106.blockchain.info.bin.Transaction
import com.kevalpatel2106.blockchain.info.bin.Wallet
import com.kevalpatel2106.blockchain.info.repository.BIRepository
import com.kevalpatel2106.blockchain.info.utils.BaseViewModel
import com.kevalpatel2106.blockchain.info.utils.SingleLiveEvent
import com.kevalpatel2106.blockchain.info.utils.addTo
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
        private val biRepository: BIRepository
) : BaseViewModel() {
    private var allTransactionsLoaded: Boolean = false

    internal val transactions = MutableLiveData<List<Transaction>>()
    internal val errorMessage = SingleLiveEvent<String>()
    internal val wallet = MutableLiveData<