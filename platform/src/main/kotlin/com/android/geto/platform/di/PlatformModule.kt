/*
 *
 *   Copyright 2023 Einstein Blanco
 *
 *   Licensed under the GNU General Public License v3.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       https://www.gnu.org/licenses/gpl-3.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package com.android.geto.platform.di

import com.android.geto.domain.platform.AssetManagerWrapper
import com.android.geto.domain.platform.LauncherAppsWrapper
import com.android.geto.domain.platform.PackageManagerWrapper
import com.android.geto.domain.platform.SecureSettingsWrapper
import com.android.geto.domain.platform.ShortcutManagerCompatWrapper
import com.android.geto.platform.assetmanager.DefaultAssetManagerWrapper
import com.android.geto.platform.drawable.AndroidDrawableWrapper
import com.android.geto.platform.drawable.DefaultDrawableWrapper
import com.android.geto.platform.launcherapps.AndroidLauncherAppsWrapper
import com.android.geto.platform.launcherapps.DefaultLauncherAppsWrapper
import com.android.geto.platform.notificationmanager.AndroidNotificationManagerWrapper
import com.android.geto.platform.notificationmanager.DefaultNotificationManagerWrapper
import com.android.geto.platform.packagemanager.DefaultPackageManagerWrapper
import com.android.geto.platform.securesettings.DefaultSecureSettingsWrapper
import com.android.geto.platform.shortcutmanager.DefaultShortcutManagerCompatWrapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface PlatformModule {

    @Binds
    @Singleton
    fun assetManagerWrapper(impl: DefaultAssetManagerWrapper): AssetManagerWrapper

    @Binds
    @Singleton
    fun androidDrawableWrapper(impl: DefaultDrawableWrapper): AndroidDrawableWrapper

    @Binds
    @Singleton
    fun launcherAppsWrapper(impl: DefaultLauncherAppsWrapper): LauncherAppsWrapper

    @Binds
    @Singleton
    fun androidLauncherAppsWrapper(impl: DefaultLauncherAppsWrapper): AndroidLauncherAppsWrapper

    @Binds
    @Singleton
    fun notificationManagerWrapper(impl: DefaultNotificationManagerWrapper): AndroidNotificationManagerWrapper

    @Binds
    @Singleton
    fun packageManagerWrapper(impl: DefaultPackageManagerWrapper): PackageManagerWrapper

    @Binds
    @Singleton
    fun secureSettingsWrapper(impl: DefaultSecureSettingsWrapper): SecureSettingsWrapper

    @Binds
    @Singleton
    fun shortcutManagerCompatWrapper(impl: DefaultShortcutManagerCompatWrapper): ShortcutManagerCompatWrapper
}
