/**
 * This class is generated by jOOQ
 */
package persistencia.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import persistencia.tables.Contador;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContadorRecord extends UpdatableRecordImpl<ContadorRecord> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = -2141527;

	/**
	 * Setter for <code>kutipak.contador.contadorID</code>.
	 */
	public void setContadorid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>kutipak.contador.contadorID</code>.
	 */
	public Integer getContadorid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>kutipak.contador.valor</code>.
	 */
	public void setValor(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>kutipak.contador.valor</code>.
	 */
	public Integer getValor() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Contador.CONTADOR.CONTADORID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Contador.CONTADOR.VALOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getContadorid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getValor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContadorRecord value1(Integer value) {
		setContadorid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContadorRecord value2(Integer value) {
		setValor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContadorRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContadorRecord
	 */
	public ContadorRecord() {
		super(Contador.CONTADOR);
	}

	/**
	 * Create a detached, initialised ContadorRecord
	 */
	public ContadorRecord(Integer contadorid, Integer valor) {
		super(Contador.CONTADOR);

		setValue(0, contadorid);
		setValue(1, valor);
	}
}
