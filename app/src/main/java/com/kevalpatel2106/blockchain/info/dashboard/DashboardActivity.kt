package com.kevalpatel2106.blockchain.info.dashboard

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.snackbar.Snackbar
import com.kevalpatel2106.blockchain.info.R
import com.kevalpatel2106.blockchain.info.utils.getAppComponent
import com.kevalpatel2106.blockchain.info.utils.nullSafeObserve
import com.kevalpatel2106.blockchain.info.utils.prepareLaunchIntent
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.wallet_info_card.*
import javax.inject.Inject


class DashboardActivity : AppCompatActivity() {

    private lateinit var model: DashboardViewModel

    @Inject
    internal lateinit var viewModelProvider: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getAppComponent().inject(this@DashboardActivity)
        setContentView(R.layout.activity_dashboard)

        model = ViewModelProviders
                .of(this@DashboardActivity, viewModelProvider)
                .get(DashboardViewModel::class.java)

        dashboard_appbar_height.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (verticalOffset > -appBarLayout.height) {
                dashboard_list_card.cardElevation = resources.getDimension(R.dimen.spacing