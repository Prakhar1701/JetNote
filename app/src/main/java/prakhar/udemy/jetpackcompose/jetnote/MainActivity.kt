package prakhar.udemy.jetpackcompose.jetnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import prakhar.udemy.jetpackcompose.jetnote.ui.theme.JetNoteTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val noteViewModel: NoteViewModel by viewModels()
//                    NotesApp(noteViewModel)
                }
            }
        }
    }
}

//@Composable
//fun NotesApp(noteViewModel: NoteViewModel = viewModel()) {
//    val notesList = noteViewModel.getAllNotes()
//    NoteScreen(
//        notes = notesList,
//        onAddNote = { noteViewModel.addNote(it) },
//        onRemoveNote = { noteViewModel.removeNote(it) })
//}