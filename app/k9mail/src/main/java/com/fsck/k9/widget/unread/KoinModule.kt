package com.fsck.k9.widget.unread

import org.koin.dsl.module.module

val unreadWidgetModule = module {
    single { UnreadWidgetRepository(get(), get()) }
    single { UnreadWidgetDataProvider(get(), get(), get()) }
    single { UnreadWidgetUpdater(get()) }
    single { UnreadWidgetUpdateListener(get()) }
}
