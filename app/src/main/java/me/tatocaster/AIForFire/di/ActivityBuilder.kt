package me.tatocaster.AIForFire.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.tatocaster.AIForFire.features.base.BaseActivity
import me.tatocaster.AIForFire.features.base.BaseActivityModule
import me.tatocaster.AIForFire.features.base.BaseFragment
import me.tatocaster.AIForFire.features.base.BaseFragmentModule
import me.tatocaster.AIForFire.features.create.presentation.CreateFragment
import me.tatocaster.AIForFire.features.create.presentation.CreateFragmentModule
import me.tatocaster.AIForFire.features.home.presentation.HomeActivity
import me.tatocaster.AIForFire.features.home.presentation.HomeActivityModule
import me.tatocaster.AIForFire.features.home.presentation.HomeFragment
import me.tatocaster.AIForFire.features.home.presentation.HomeFragmentModule
import me.tatocaster.AIForFire.features.map.presentation.MapsActivity
import me.tatocaster.AIForFire.features.map.presentation.MapsActivityModule

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindHomeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [MapsActivityModule::class])
    abstract fun bindMapsActivity(): MapsActivity

    @ContributesAndroidInjector(modules = [BaseActivityModule::class])
    abstract fun bindBaseActivity(): BaseActivity



    // Fragments
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindHomeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [BaseFragmentModule::class])
    abstract fun bindBaseFragment(): BaseFragment

    @ContributesAndroidInjector(modules = [CreateFragmentModule::class])
    abstract fun bindCreateFragment(): CreateFragment
}
