import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "build_table")
data class Build(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo()
    var Name:String,

    @ColumnInfo()
    var Bonuses:String,

    @ColumnInfo()
    var Logic:Int,

    @ColumnInfo()
    var Encyclopedia:Int,

    @ColumnInfo()
    var Rhetoric:Int,

    @ColumnInfo()
    var Drama:Int,

    @ColumnInfo()
    var Conceptualization:Int,

    @ColumnInfo()
    var VisualCalculus:Int,

    @ColumnInfo()
    var Volition:Int,

    @ColumnInfo()
    var InlandEmpire:Int,

    @ColumnInfo()
    var Empathy:Int,

    @ColumnInfo()
    var Authority:Int,

    @ColumnInfo()
    var EspritDeCorps:Int,

    @ColumnInfo()
    var Suggestion:Int,

    @ColumnInfo()
    var Endurance:Int,

    @ColumnInfo()
    var PainThreshold:Int,

    @ColumnInfo()
    var PhysicalInstrument:Int,

    @ColumnInfo()
    var Electrochemistry:Int,

    @ColumnInfo()
    var Shivers:Int,

    @ColumnInfo()
    var HalfLight:Int,

    @ColumnInfo()
    var HandEyeCoordination:Int,

    @ColumnInfo()
    var Perception:Int,

    @ColumnInfo()
    var ReactionSpeed:Int,

    @ColumnInfo()
    var SavoirFaire:Int,

    @ColumnInfo()
    var Interfacing:Int,

    @ColumnInfo()
    var Composure:Int
)