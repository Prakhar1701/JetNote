package prakhar.udemy.jetpackcompose.jetnote.data

import androidx.room.*
import prakhar.udemy.jetpackcompose.jetnote.model.Note

@Dao
interface NoteDatabaseDao {

    @Query("SELECT * from notes_tbl")
    fun getNotes(): List<Note>

    @Query("SELECT * from notes_tbl where id =:id")
    fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(note: Note)

    @Query("DELETE  from notes_tbl")
    fun deleteAll()

    @Delete
    fun deleteNote(note: Note)
}
