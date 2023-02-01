package ytemplate.android.data

import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import ytemplate.android.data.datasource.LocalPostDataSource
import ytemplate.android.data.datasource.LocalPostDataSourceImpl
import ytemplate.android.data.datasource.RemotePostDataSource
import ytemplate.android.data.datasource.RemotePostDataSourceImpl
import ytemplate.android.data.di.RepositoryModule

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
interface TestDataModule {
    @Binds
    fun bindMyModelRepository(myPostRepository: MyPostRepositoryImpl): MyPostRepository
    @Binds
    fun bindLocalPostDataSource(localPostDataSource: LocalPostDataSourceImpl): LocalPostDataSource

    @Binds
    fun bindRemotePostDataSource(remotePostDataSource: RemotePostDataSourceImpl): RemotePostDataSource
}