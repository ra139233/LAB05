/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Exemplar#getIdExemplar <em>Id Exemplar</em>}</li>
 *   <li>{@link Model.Exemplar#getDataEntrada <em>Data Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Exemplar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Exemplar</em>' attribute.
	 * @see #setIdExemplar(int)
	 * @see Model.ModelPackage#getExemplar_IdExemplar()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdExemplar();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getIdExemplar <em>Id Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Exemplar</em>' attribute.
	 * @see #getIdExemplar()
	 * @generated
	 */
	void setIdExemplar(int value);

	/**
	 * Returns the value of the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Entrada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Entrada</em>' attribute.
	 * @see #setDataEntrada(Date)
	 * @see Model.ModelPackage#getExemplar_DataEntrada()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataEntrada();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getDataEntrada <em>Data Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Entrada</em>' attribute.
	 * @see #getDataEntrada()
	 * @generated
	 */
	void setDataEntrada(Date value);

} // Exemplar
