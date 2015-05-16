/**
 */
package Model.impl;

import Model.Aluno;
import Model.Atendente;
import Model.Biblioteca;
import Model.Bibliotecario;
import Model.Empréstimo;
import Model.Exemplar;
import Model.Livro;
import Model.Manual;
import Model.ModelFactory;
import Model.ModelPackage;
import Model.Periodico;
import Model.Professor;
import Model.Publicacao;
import Model.Terminal;
import Model.Tese;
import Model.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empréstimoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atendenteEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_TerminalAtivo() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiblioteca() {
		return bibliotecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_IdExemplar() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_DataEntrada() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Nome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Instituto_Faculdade() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_NumRegistro() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Rg() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cpf() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_TipoUsuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_RegAluno() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessor_RegProfessor() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliotecario() {
		return bibliotecarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliotecario_IdFuncionario() {
		return (EAttribute)bibliotecarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicacao() {
		return publicacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Autor() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_DataPublicacao() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpréstimo() {
		return empréstimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpréstimo_DataRetirada() {
		return (EAttribute)empréstimoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpréstimo_DataDevolucao() {
		return (EAttribute)empréstimoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpréstimo_IdExemplar() {
		return (EAttribute)empréstimoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpréstimo_NumRegistro() {
		return (EAttribute)empréstimoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivro() {
		return livroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_Nome() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_Editora() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_Edicao() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_Volume() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodico() {
		return periodicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodico_Nome() {
		return (EAttribute)periodicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodico_Editor() {
		return (EAttribute)periodicoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodico_Peridiocidade() {
		return (EAttribute)periodicoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTese() {
		return teseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTese_Nome() {
		return (EAttribute)teseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTese_Assunto() {
		return (EAttribute)teseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManual_Nome() {
		return (EAttribute)manualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManual_Tematica() {
		return (EAttribute)manualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtendente() {
		return atendenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtendente_IdFuncionario() {
		return (EAttribute)atendenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__TERMINAL_ATIVO);

		bibliotecaEClass = createEClass(BIBLIOTECA);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__ID_EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__DATA_ENTRADA);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__NOME);
		createEAttribute(usuarioEClass, USUARIO__INSTITUTO_FACULDADE);
		createEAttribute(usuarioEClass, USUARIO__NUM_REGISTRO);
		createEAttribute(usuarioEClass, USUARIO__RG);
		createEAttribute(usuarioEClass, USUARIO__CPF);
		createEAttribute(usuarioEClass, USUARIO__TIPO_USUARIO);

		alunoEClass = createEClass(ALUNO);
		createEAttribute(alunoEClass, ALUNO__REG_ALUNO);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__REG_PROFESSOR);

		bibliotecarioEClass = createEClass(BIBLIOTECARIO);
		createEAttribute(bibliotecarioEClass, BIBLIOTECARIO__ID_FUNCIONARIO);

		publicacaoEClass = createEClass(PUBLICACAO);
		createEAttribute(publicacaoEClass, PUBLICACAO__AUTOR);
		createEAttribute(publicacaoEClass, PUBLICACAO__DATA_PUBLICACAO);

		empréstimoEClass = createEClass(EMPRÉSTIMO);
		createEAttribute(empréstimoEClass, EMPRÉSTIMO__DATA_RETIRADA);
		createEAttribute(empréstimoEClass, EMPRÉSTIMO__DATA_DEVOLUCAO);
		createEAttribute(empréstimoEClass, EMPRÉSTIMO__ID_EXEMPLAR);
		createEAttribute(empréstimoEClass, EMPRÉSTIMO__NUM_REGISTRO);

		livroEClass = createEClass(LIVRO);
		createEAttribute(livroEClass, LIVRO__NOME);
		createEAttribute(livroEClass, LIVRO__EDITORA);
		createEAttribute(livroEClass, LIVRO__EDICAO);
		createEAttribute(livroEClass, LIVRO__VOLUME);

		periodicoEClass = createEClass(PERIODICO);
		createEAttribute(periodicoEClass, PERIODICO__NOME);
		createEAttribute(periodicoEClass, PERIODICO__EDITOR);
		createEAttribute(periodicoEClass, PERIODICO__PERIDIOCIDADE);

		teseEClass = createEClass(TESE);
		createEAttribute(teseEClass, TESE__NOME);
		createEAttribute(teseEClass, TESE__ASSUNTO);

		manualEClass = createEClass(MANUAL);
		createEAttribute(manualEClass, MANUAL__NOME);
		createEAttribute(manualEClass, MANUAL__TEMATICA);

		atendenteEClass = createEClass(ATENDENTE);
		createEAttribute(atendenteEClass, ATENDENTE__ID_FUNCIONARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add supertypes to classes
		alunoEClass.getESuperTypes().add(this.getUsuario());
		professorEClass.getESuperTypes().add(this.getUsuario());
		bibliotecarioEClass.getESuperTypes().add(this.getUsuario());
		publicacaoEClass.getESuperTypes().add(this.getExemplar());
		livroEClass.getESuperTypes().add(this.getPublicacao());
		periodicoEClass.getESuperTypes().add(this.getPublicacao());
		teseEClass.getESuperTypes().add(this.getPublicacao());
		manualEClass.getESuperTypes().add(this.getPublicacao());
		atendenteEClass.getESuperTypes().add(this.getUsuario());

		// Initialize classes and features; add operations and parameters
		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminal_TerminalAtivo(), theTypesPackage.getBoolean(), "terminalAtivo", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(terminalEClass, null, "fazerLogin");
		addEParameter(op, theTypesPackage.getString(), "idFuncionario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "senha", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(terminalEClass, null, "fazerLogout");

		initEClass(bibliotecaEClass, Biblioteca.class, "Biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bibliotecaEClass, null, "consultarExemplar");
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bibliotecaEClass, null, "consultarUsuario");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nomeUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bibliotecaEClass, null, "consultarDataDevolucao");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bibliotecaEClass, null, "consultarMulta");
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bibliotecaEClass, null, "verificarReserva");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExemplar_IdExemplar(), theTypesPackage.getInteger(), "idExemplar", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_DataEntrada(), ecorePackage.getEDate(), "dataEntrada", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Instituto_Faculdade(), theTypesPackage.getString(), "Instituto_Faculdade", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_NumRegistro(), theTypesPackage.getInteger(), "numRegistro", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Rg(), theTypesPackage.getInteger(), "rg", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cpf(), theTypesPackage.getInteger(), "cpf", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_TipoUsuario(), theTypesPackage.getInteger(), "tipoUsuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(usuarioEClass, null, "reservarExemplar");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(usuarioEClass, null, "cancelaReserva");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(usuarioEClass, null, "emprestaReserva");
		addEParameter(op, theTypesPackage.getInteger(), "numRegistro", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAluno_RegAluno(), theTypesPackage.getInteger(), "regAluno", null, 1, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_RegProfessor(), theTypesPackage.getInteger(), "regProfessor", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bibliotecarioEClass, Bibliotecario.class, "Bibliotecario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBibliotecario_IdFuncionario(), theTypesPackage.getInteger(), "idFuncionario", null, 1, 1, Bibliotecario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(bibliotecarioEClass, null, "incluiExemplar");
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bibliotecarioEClass, null, "excluiExemplar");
		addEParameter(op, theTypesPackage.getInteger(), "idExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(bibliotecarioEClass, null, "atualizaDadosExemplar");

		initEClass(publicacaoEClass, Publicacao.class, "Publicacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicacao_Autor(), theTypesPackage.getString(), "autor", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_DataPublicacao(), ecorePackage.getEDate(), "dataPublicacao", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(empréstimoEClass, Empréstimo.class, "Empréstimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpréstimo_DataRetirada(), ecorePackage.getEDate(), "dataRetirada", null, 1, 1, Empréstimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmpréstimo_DataDevolucao(), ecorePackage.getEDate(), "dataDevolucao", null, 1, 1, Empréstimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmpréstimo_IdExemplar(), theTypesPackage.getInteger(), "idExemplar", null, 1, 1, Empréstimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmpréstimo_NumRegistro(), theTypesPackage.getInteger(), "numRegistro", null, 1, 1, Empréstimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(empréstimoEClass, null, "realizaEmprestimo");
		addEParameter(op, theTypesPackage.getInteger(), "tipoUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(empréstimoEClass, null, "calculaMulta");
		addEParameter(op, theTypesPackage.getInteger(), "tipoUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(livroEClass, Livro.class, "Livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivro_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLivro_Editora(), theTypesPackage.getString(), "editora", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLivro_Edicao(), theTypesPackage.getInteger(), "edicao", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLivro_Volume(), theTypesPackage.getInteger(), "volume", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(periodicoEClass, Periodico.class, "Periodico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodico_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Periodico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPeriodico_Editor(), theTypesPackage.getString(), "editor", null, 1, 1, Periodico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPeriodico_Peridiocidade(), ecorePackage.getEDate(), "peridiocidade", null, 1, 1, Periodico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(teseEClass, Tese.class, "Tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTese_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Tese.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTese_Assunto(), theTypesPackage.getString(), "assunto", null, 1, 1, Tese.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManual_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Manual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManual_Tematica(), theTypesPackage.getString(), "tematica", null, 1, 1, Manual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(atendenteEClass, Atendente.class, "Atendente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtendente_IdFuncionario(), theTypesPackage.getInteger(), "idFuncionario", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //ModelPackageImpl
