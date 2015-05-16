/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Terminal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.TerminalImpl#isTerminalAtivo <em>Terminal Ativo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal {
	/**
	 * The default value of the '{@link #isTerminalAtivo() <em>Terminal Ativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminalAtivo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINAL_ATIVO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTerminalAtivo() <em>Terminal Ativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminalAtivo()
	 * @generated
	 * @ordered
	 */
	protected boolean terminalAtivo = TERMINAL_ATIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTerminalAtivo() {
		return terminalAtivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalAtivo(boolean newTerminalAtivo) {
		boolean oldTerminalAtivo = terminalAtivo;
		terminalAtivo = newTerminalAtivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__TERMINAL_ATIVO, oldTerminalAtivo, terminalAtivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fazerLogin(String idFuncionario, int senha) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fazerLogout() {
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
			case ModelPackage.TERMINAL__TERMINAL_ATIVO:
				return isTerminalAtivo() ? Boolean.TRUE : Boolean.FALSE;
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
			case ModelPackage.TERMINAL__TERMINAL_ATIVO:
				setTerminalAtivo(((Boolean)newValue).booleanValue());
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
			case ModelPackage.TERMINAL__TERMINAL_ATIVO:
				setTerminalAtivo(TERMINAL_ATIVO_EDEFAULT);
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
			case ModelPackage.TERMINAL__TERMINAL_ATIVO:
				return terminalAtivo != TERMINAL_ATIVO_EDEFAULT;
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
		result.append(" (terminalAtivo: ");
		result.append(terminalAtivo);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl
