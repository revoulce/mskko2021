package pro.hakta.mad.mskko2021.response

import pro.hakta.mad.mskko2021.model.Feeling

data class FeelingsResponse(
    var success: Boolean? = null,
    var data: MutableList<Feeling>? = null
)
