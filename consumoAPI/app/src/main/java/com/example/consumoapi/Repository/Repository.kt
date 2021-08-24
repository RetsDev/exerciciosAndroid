package com.example.consumoapi.Repository

import com.example.consumoapi.network.EndPoint
import com.example.consumoapi.network.RetrofitInit


class Repository {

    private var url = "https://wger.de/api/v2/"
    private var service :KClass<EndPoint> = EndPoint::class
}