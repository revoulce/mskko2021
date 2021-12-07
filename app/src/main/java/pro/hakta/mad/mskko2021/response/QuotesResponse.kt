package pro.hakta.mad.mskko2021.response

import pro.hakta.mad.mskko2021.model.Quote

data class QuotesResponse(
    var success: Boolean? = null,
    var data: MutableList<Quote>? = null
)
