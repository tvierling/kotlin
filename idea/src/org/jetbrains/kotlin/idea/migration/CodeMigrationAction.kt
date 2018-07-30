/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.migration

class CodeMigrationAction : CodeInspectionAction("Code Migration", "Code migration") {
    override fun getHelpTopic(): String {
        return "reference.dialogs.cleanup.scope"
    }

    companion object {
        const val ACTION_ID = "KotlinCodeMigration"
    }
}