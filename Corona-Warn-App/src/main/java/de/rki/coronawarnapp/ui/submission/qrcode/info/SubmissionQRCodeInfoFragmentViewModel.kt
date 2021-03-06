package de.rki.coronawarnapp.ui.submission.qrcode.info

import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import de.rki.coronawarnapp.util.ui.SingleLiveEvent
import de.rki.coronawarnapp.util.viewmodel.CWAViewModel
import de.rki.coronawarnapp.util.viewmodel.SimpleCWAViewModelFactory

class SubmissionQRCodeInfoFragmentViewModel @AssistedInject constructor() : CWAViewModel() {

    val navigateToDispatcher = SingleLiveEvent<Unit>()
    val navigateToQRScan = SingleLiveEvent<Unit>()

    fun onBackPressed() {
        navigateToDispatcher.postValue(Unit)
    }

    fun onNextPressed() {
        navigateToQRScan.postValue(Unit)
    }

    @AssistedFactory
    interface Factory : SimpleCWAViewModelFactory<SubmissionQRCodeInfoFragmentViewModel>
}
