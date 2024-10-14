package com.sp45.vridassignment.di

import com.sp45.vridassignment.core.utils.Constants.BASE_URL
import com.sp45.vridassignment.data.api.BlogApi
import com.sp45.vridassignment.data.repository.BlogRepositoryImpl
import com.sp45.vridassignment.domain.repository.BlogRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofitInstance() : Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    @Provides
    @Singleton
    fun provideBlogsApi(retrofit: Retrofit) : BlogApi = retrofit.create(BlogApi::class.java)

    @Provides
    @Singleton
    fun provideBlogRepository(api: BlogApi) : BlogRepository {
        return BlogRepositoryImpl(api)
    }



}