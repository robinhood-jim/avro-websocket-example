import java.util.UUID

import com.sksamuel.avro4s.{AvroSchema, RecordFormat}
import com.sksamuel.avro4s.{FromRecord, RecordFormat, SchemaFor, ToRecord}
import org.apache.avro.generic.GenericRecord
import org.joda.time.DateTime

package object m {

  sealed trait Model{}

  final case class Ingredient(name: String, sugar: Double, fat: Double) extends Model
  final case class Pizza(name: String, ingredients: Seq[Ingredient], vegetarian: Boolean, vegan: Boolean, calories: Int) extends Model

  final case class Dog(name: String) extends Model


}

