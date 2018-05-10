/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.notes.notes;

import android.support.annotation.NonNull;

import com.example.android.testing.notes.data.Note;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 * @author Jackie
 */
public interface NotesContract {

    /**
     * The interface View.
     */
    interface View {

        /**
         * Sets progress indicator.
         *
         * @param active the active
         */
        void setProgressIndicator(boolean active);

        /**
         * Show notes.
         *
         * @param notes the notes
         */
        void showNotes(List<Note> notes);

        /**
         * Show add note.
         */
        void showAddNote();

        /**
         * Show note detail ui.
         *
         * @param noteId the note id
         */
        void showNoteDetailUi(String noteId);
    }

    /**
     * The interface User actions listener.
     */
    interface UserActionsListener {

        /**
         * Load notes.
         *
         * @param forceUpdate the force update
         */
        void loadNotes(boolean forceUpdate);

        /**
         * Add new note.
         */
        void addNewNote();

        /**
         * Open note details.
         *
         * @param requestedNote the requested note
         */
        void openNoteDetails(@NonNull Note requestedNote);
    }
}
