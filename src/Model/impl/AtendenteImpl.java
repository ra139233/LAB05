/**
 */
package Model.impl;

import Model.Atendente;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.AtendenteImpl#getIdFuncionario <em>Id Funcionario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtendenteImpl extends UsuarioImpl implements Atendente {
	/**
	 * The default value of the '{@link #getIdFuncionario() <em>Id Funcionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFuncionario()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_FUNCIONARIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdFuncionario() <em>Id Funcionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFuncionario()
	 * @generated
	 * @ordered
	 */
	protected int idFuncionario = ID_FUNCIONARIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtendenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATENDENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdFuncionario(int newIdFuncionario) {
		int oldIdFuncionario = idFuncionario;
		idFuncionario = newIdFuncionario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATENDENTE__ID_FUNCIONARIO, oldIdFuncionario, idFuncionario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATENDENTE__ID_FUNCIONARIO:
				return new Integer(getIdFuncionario());
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
			case ModelPackage.ATENDENTE__ID_FUNCIONARIO:
				setIdFuncionario(((Integer)newValue).intValue());
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
			case ModelPackage.ATENDENTE__ID_FUNCIONARIO:
				setIdFuncionario(ID_FUNCIONARIO_EDEFAULT);
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
			case ModelPackage.ATENDENTE__ID_FUNCIONARIO:
				return idFuncionario != ID_FUNCIONARIO_EDEFAULT;
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
		result.append(" (idFuncionario: ");
		result.append(idFuncionario);
		result.append(')');
		return result.toString();
	}

} //AtendenteImpl
