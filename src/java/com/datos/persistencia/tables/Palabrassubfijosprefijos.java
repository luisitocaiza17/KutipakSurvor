/**
 * This class is generated by jOOQ
 */
package persistencia.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import persistencia.Keys;
import persistencia.Kutipak;
import persistencia.tables.records.PalabrassubfijosprefijosRecord;


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
public class Palabrassubfijosprefijos extends TableImpl<PalabrassubfijosprefijosRecord> {

	private static final long serialVersionUID = -54441467;

	/**
	 * The reference instance of <code>kutipak.palabrassubfijosprefijos</code>
	 */
	public static final Palabrassubfijosprefijos PALABRASSUBFIJOSPREFIJOS = new Palabrassubfijosprefijos();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PalabrassubfijosprefijosRecord> getRecordType() {
		return PalabrassubfijosprefijosRecord.class;
	}

	/**
	 * The column <code>kutipak.palabrassubfijosprefijos.ID</code>.
	 */
	public final TableField<PalabrassubfijosprefijosRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>kutipak.palabrassubfijosprefijos.PALABRA</code>.
	 */
	public final TableField<PalabrassubfijosprefijosRecord, String> PALABRA = createField("PALABRA", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

	/**
	 * The column <code>kutipak.palabrassubfijosprefijos.IDIOMA</code>.
	 */
	public final TableField<PalabrassubfijosprefijosRecord, Integer> IDIOMA = createField("IDIOMA", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>kutipak.palabrassubfijosprefijos</code> table reference
	 */
	public Palabrassubfijosprefijos() {
		this("palabrassubfijosprefijos", null);
	}

	/**
	 * Create an aliased <code>kutipak.palabrassubfijosprefijos</code> table reference
	 */
	public Palabrassubfijosprefijos(String alias) {
		this(alias, PALABRASSUBFIJOSPREFIJOS);
	}

	private Palabrassubfijosprefijos(String alias, Table<PalabrassubfijosprefijosRecord> aliased) {
		this(alias, aliased, null);
	}

	private Palabrassubfijosprefijos(String alias, Table<PalabrassubfijosprefijosRecord> aliased, Field<?>[] parameters) {
		super(alias, Kutipak.KUTIPAK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PalabrassubfijosprefijosRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PALABRASSUBFIJOSPREFIJOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PalabrassubfijosprefijosRecord> getPrimaryKey() {
		return Keys.KEY_PALABRASSUBFIJOSPREFIJOS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PalabrassubfijosprefijosRecord>> getKeys() {
		return Arrays.<UniqueKey<PalabrassubfijosprefijosRecord>>asList(Keys.KEY_PALABRASSUBFIJOSPREFIJOS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Palabrassubfijosprefijos as(String alias) {
		return new Palabrassubfijosprefijos(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Palabrassubfijosprefijos rename(String name) {
		return new Palabrassubfijosprefijos(name, null);
	}
}
