/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ExemplarImpl#getIdExemplar <em>Id Exemplar</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getDataEntrada <em>Data Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #getIdExemplar() <em>Id Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExemplar()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EXEMPLAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdExemplar() <em>Id Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExemplar()
	 * @generated
	 * @ordered
	 */
	protected int idExemplar = ID_EXEMPLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataEntrada() <em>Data Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntrada()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_ENTRADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataEntrada() <em>Data Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntrada()
	 * @generated
	 * @ordered
	 */
	protected Date dataEntrada = DATA_ENTRADA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdExemplar() {
		return idExemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdExemplar(int newIdExemplar) {
		int oldIdExemplar = idExemplar;
		idExemplar = newIdExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__ID_EXEMPLAR, oldIdExemplar, idExemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEntrada(Date newDataEntrada) {
		Date oldDataEntrada = dataEntrada;
		dataEntrada = newDataEntrada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__DATA_ENTRADA, oldDataEntrada, dataEntrada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__ID_EXEMPLAR:
				return new Integer(getIdExemplar());
			case ModelPackage.EXEMPLAR__DATA_ENTRADA:
				return getDataEntrada();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__ID_EXEMPLAR:
				setIdExemplar(((Integer)newValue).intValue());
				return;
			case ModelPackage.EXEMPLAR__DATA_ENTRADA:
				setDataEntrada((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__ID_EXEMPLAR:
				setIdExemplar(ID_EXEMPLAR_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__DATA_ENTRADA:
				setDataEntrada(DATA_ENTRADA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__ID_EXEMPLAR:
				return idExemplar != ID_EXEMPLAR_EDEFAULT;
			case ModelPackage.EXEMPLAR__DATA_ENTRADA:
				return DATA_ENTRADA_EDEFAULT == null ? dataEntrada != null : !DATA_ENTRADA_EDEFAULT.equals(dataEntrada);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idExemplar: ");
		result.append(idExemplar);
		result.append(", dataEntrada: ");
		result.append(dataEntrada);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl
