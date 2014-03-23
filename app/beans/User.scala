package beans

/* Persistence Annotations */
import javax.persistence._
import scala.beans.BeanProperty
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType


@Entity
class User {

	def this(name: String, phone: String) = {
		this()
		this.setName(name)
		this.setPhone(phone)
	}

	@Id
	@GeneratedValue
	@BeanProperty
	var id: Int = _

	@Column(nullable = false)
	@BeanProperty
	protected var name: String = ""

	@Column
	@BeanProperty
	protected var phone: String = _

}

object User_ {
	val id = "id"
	val name = "name"
	val phone = "phone"

	override def toString = "user"
}