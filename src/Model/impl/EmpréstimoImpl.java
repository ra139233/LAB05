/**
 */
package Model.impl;

import Model.Empréstimo;
import Model.ModelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empréstimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmpréstimoImpl#getDataRetirada <em>Data Retirada</em>}</li>
 *   <li>{@link Model.impl.EmpréstimoImpl#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.impl.EmpréstimoImpl#getIdExemplar <em>Id Exemplar</em>}</li>
 *   <li>{@link Model.impl.EmpréstimoImpl#getNumRegistro <em>Num Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmpréstimoImpl extends MinimalEObjectImpl.Container implements Empréstimo {
	/**
	 * The default value of the '{@link #getDataRetirada() <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRetirada()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_RETIRADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRetirada() <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRetirada()
	 * @generated
	 * @ordered
	 */
	protected Date dataRetirada = DATA_RETIRADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_DEVOLUCAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected Date dataDevolucao = DATA_DEVOLUCAO_EDEFAULT;

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
	 * The default value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected int numRegistro = NUM_REGISTRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpréstimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRÉSTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataRetirada() {
		return dataRetirada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRetirada(Date newDataRetirada) {
		Date oldDataRetirada = dataRetirada;
		dataRetirada = newDataRetirada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRÉSTIMO__DATA_RETIRADA, oldDataRetirada, dataRetirada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDevolucao(Date newDataDevolucao) {
		Date oldDataDevolucao = dataDevolucao;
		dataDevolucao = newDataDevolucao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRÉSTIMO__DATA_DEVOLUCAO, oldDataDevolucao, dataDevolucao));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRÉSTIMO__ID_EXEMPLAR, oldIdExemplar, idExemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumRegistro() {
		return numRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumRegistro(int newNumRegistro) {
		int oldNumRegistro = numRegistro;
		numRegistro = newNumRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRÉSTIMO__NUM_REGISTRO, oldNumRegistro, numRegistro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizaEmprestimo(int tipoUsuario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculaMulta(int tipoUsuario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPRÉSTIMO__DATA_RETIRADA:
				return getDataRetirada();
			case ModelPackage.EMPRÉSTIMO__DATA_DEVOLUCAO:
				return getDataDevolucao();
			case ModelPackage.EMPRÉSTIMO__ID_EXEMPLAR:
				return new Integer(getIdExemplar());
			case ModelPackage.EMPRÉSTIMO__NUM_REGISTRO:
				return new Integer(getNumRegistro());
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
			case ModelPackage.EMPRÉSTIMO__DATA_RETIRADA:
				setDataRetirada((Date)newValue);
				return;
			case ModelPackage.EMPRÉSTIMO__DATA_DEVOLUCAO:
				setDataDevolucao((Date)newValue);
				return;
			case ModelPackage.EMPRÉSTIMO__ID_EXEMPLAR:
				setIdExemplar(((Integer)newValue).intValue());
				return;
			case ModelPackage.EMPRÉSTIMO__NUM_REGISTRO:
				setNumRegistro(((Integer)newValue).intValue());
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
			case ModelPackage.EMPRÉSTIMO__DATA_RETIRADA:
				setDataRetirada(DATA_RETIRADA_EDEFAULT);
				return;
			case ModelPackage.EMPRÉSTIMO__DATA_DEVOLUCAO:
				setDataDevolucao(DATA_DEVOLUCAO_EDEFAULT);
				return;
			case ModelPackage.EMPRÉSTIMO__ID_EXEMPLAR:
				setIdExemplar(ID_EXEMPLAR_EDEFAULT);
				return;
			case ModelPackage.EMPRÉSTIMO__NUM_REGISTRO:
				setNumRegistro(NUM_REGISTRO_EDEFAULT);
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
			case ModelPackage.EMPRÉSTIMO__DATA_RETIRADA:
				return DATA_RETIRADA_EDEFAULT == null ? dataRetirada != null : !DATA_RETIRADA_EDEFAULT.equals(dataRetirada);
			case ModelPackage.EMPRÉSTIMO__DATA_DEVOLUCAO:
				return DATA_DEVOLUCAO_EDEFAULT == null ? dataDevolucao != null : !DATA_DEVOLUCAO_EDEFAULT.equals(dataDevolucao);
			case ModelPackage.EMPRÉSTIMO__ID_EXEMPLAR:
				return idExemplar != ID_EXEMPLAR_EDEFAULT;
			case ModelPackage.EMPRÉSTIMO__NUM_REGISTRO:
				return numRegistro != NUM_REGISTRO_EDEFAULT;
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
		result.append(" (dataRetirada: ");
		result.append(dataRetirada);
		result.append(", dataDevolucao: ");
		result.append(dataDevolucao);
		result.append(", idExemplar: ");
		result.append(idExemplar);
		result.append(", numRegistro: ");
		result.append(numRegistro);
		result.append(')');
		return result.toString();
	}

} //EmpréstimoImpl
