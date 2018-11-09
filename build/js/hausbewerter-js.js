(function (_, Kotlin, $module$kotlin_react_dom, $module$react_jsonschema_form, $module$react, $module$react_materialize, $module$react_router_dom, $module$axios, $module$kotlin_extensions, $module$kotlin_react, $module$react_dom) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var Unit = Kotlin.kotlin.Unit;
  var render = $module$kotlin_react_dom.react.dom.render_2955dm$;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var json = Kotlin.kotlin.js.json_pyyo18$;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var createElement = $module$react.createElement;
  var getKClass = Kotlin.getKClass;
  var Button = $module$react_materialize.Button;
  var NavBar = $module$react_materialize.Navbar;
  var Link = $module$react_router_dom.Link;
  var get_js = Kotlin.kotlin.js.get_js_1yb8b7$;
  var NavItem = $module$react_materialize.NavItem;
  var Parallax = $module$react_materialize.Parallax;
  var Input = $module$react_materialize.Input;
  var Card = $module$react_materialize.Card;
  var ensureNotNull = Kotlin.ensureNotNull;
  var CardTitle = $module$react_materialize.CardTitle;
  var Row = $module$react_materialize.Row;
  var Col = $module$react_materialize.Col;
  var Footer = $module$react_materialize.Footer;
  var Icon = $module$react_materialize.Icon;
  var BrowserRouter = $module$react_router_dom.BrowserRouter;
  var Switch = $module$react_router_dom.Switch;
  var Route = $module$react_router_dom.Route;
  var throwUPAE = Kotlin.throwUPAE;
  var clone = $module$kotlin_extensions.kotlinext.js.clone_issdgt$;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Enum = Kotlin.kotlin.Enum;
  var throwISE = Kotlin.throwISE;
  var equals = Kotlin.equals;
  var UnsupportedOperationException_init = Kotlin.kotlin.UnsupportedOperationException_init_pdl1vj$;
  var firstOrNull = Kotlin.kotlin.collections.firstOrNull_2p1efm$;
  var iterator = Kotlin.kotlin.js.iterator_s8jyvk$;
  var asSequence = Kotlin.kotlin.sequences.asSequence_35ci02$;
  var map = Kotlin.kotlin.sequences.map_z5avom$;
  var startsWith = Kotlin.kotlin.text.startsWith_7epoxm$;
  var splitToSequence = Kotlin.kotlin.text.splitToSequence_ip8yn$;
  var first = Kotlin.kotlin.sequences.first_veqyi0$;
  var contains = Kotlin.kotlin.text.contains_li3zpu$;
  var add = Kotlin.kotlin.js.add_g26eq9$;
  var substringAfterLast = Kotlin.kotlin.text.substringAfterLast_8cymmc$;
  var splitToSequence_0 = Kotlin.kotlin.text.splitToSequence_o64adg$;
  var filter = Kotlin.kotlin.sequences.filter_euau3h$;
  var toList = Kotlin.kotlin.sequences.toList_veqyi0$;
  var RComponent_init = $module$kotlin_react.react.RComponent_init_8bz2yq$;
  var RComponent = $module$kotlin_react.react.RComponent;
  var toString = Kotlin.toString;
  var setState = $module$kotlin_react.react.setState_kpl3tw$;
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var RComponent_init_0 = $module$kotlin_react.react.RComponent_init_lqgejo$;
  var getCallableRef = Kotlin.getCallableRef;
  var Any = Object;
  var throwCCE = Kotlin.throwCCE;
  var Pair = Kotlin.kotlin.Pair;
  var findDOMNode = $module$react_dom.findDOMNode;
  Relation.prototype = Object.create(Enum.prototype);
  Relation.prototype.constructor = Relation;
  Method.prototype = Object.create(Enum.prototype);
  Method.prototype.constructor = Method;
  CardRow.prototype = Object.create(RComponent.prototype);
  CardRow.prototype.constructor = CardRow;
  Login.prototype = Object.create(RComponent.prototype);
  Login.prototype.constructor = Login;
  LoginButton.prototype = Object.create(RComponent.prototype);
  LoginButton.prototype.constructor = LoginButton;
  PasswordInput.prototype = Object.create(RComponent.prototype);
  PasswordInput.prototype.constructor = PasswordInput;
  UsernameInput.prototype = Object.create(RComponent.prototype);
  UsernameInput.prototype.constructor = UsernameInput;
  QuestionCard.prototype = Object.create(RComponent.prototype);
  QuestionCard.prototype.constructor = QuestionCard;
  CurrentResponse.prototype = Object.create(RComponent.prototype);
  CurrentResponse.prototype.constructor = CurrentResponse;
  NextRequest.prototype = Object.create(RComponent.prototype);
  NextRequest.prototype.constructor = NextRequest;
  Questionnaire.prototype = Object.create(RComponent.prototype);
  Questionnaire.prototype.constructor = Questionnaire;
  About.prototype = Object.create(RComponent.prototype);
  About.prototype.constructor = About;
  App.prototype = Object.create(RComponent.prototype);
  App.prototype.constructor = App;
  Home.prototype = Object.create(RComponent.prototype);
  Home.prototype.constructor = Home;
  Body.prototype = Object.create(RComponent.prototype);
  Body.prototype.constructor = Body;
  Nav.prototype = Object.create(RComponent.prototype);
  Nav.prototype.constructor = Nav;
  NavBrandCentralizer.prototype = Object.create(RComponent.prototype);
  NavBrandCentralizer.prototype.constructor = NavBrandCentralizer;
  function main$lambda$lambda($receiver) {
    app($receiver);
    return Unit;
  }
  function main$lambda(it) {
    render(document.getElementById('root'), void 0, main$lambda$lambda);
    return Unit;
  }
  function main(args) {
    window.onload = main$lambda;
  }
  function FormProps() {
  }
  FormProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'FormProps',
    interfaces: []
  };
  function FormData(schema, formData, onChange, onSubmit, onError, validate, transformErrors) {
    if (formData === void 0)
      formData = json([]);
    if (onChange === void 0)
      onChange = FormData_init$lambda;
    if (onSubmit === void 0)
      onSubmit = FormData_init$lambda_0;
    if (onError === void 0)
      onError = FormData_init$lambda_1;
    if (validate === void 0)
      validate = FormData_init$lambda_2;
    if (transformErrors === void 0)
      transformErrors = FormData_init$lambda_3;
    this.schema_lamlrn$_0 = schema;
    this.formData_o8fjsw$_0 = formData;
    this.onChange_t1o9bz$_0 = onChange;
    this.onSubmit_e2b4fd$_0 = onSubmit;
    this.onError_8x31st$_0 = onError;
    this.validate_nmlhu0$_0 = validate;
    this.transformErrors_e98hkh$_0 = transformErrors;
  }
  Object.defineProperty(FormData.prototype, 'schema', {
    get: function () {
      return this.schema_lamlrn$_0;
    },
    set: function (schema) {
      this.schema_lamlrn$_0 = schema;
    }
  });
  Object.defineProperty(FormData.prototype, 'formData', {
    get: function () {
      return this.formData_o8fjsw$_0;
    },
    set: function (formData) {
      this.formData_o8fjsw$_0 = formData;
    }
  });
  Object.defineProperty(FormData.prototype, 'onChange', {
    get: function () {
      return this.onChange_t1o9bz$_0;
    },
    set: function (onChange) {
      this.onChange_t1o9bz$_0 = onChange;
    }
  });
  Object.defineProperty(FormData.prototype, 'onSubmit', {
    get: function () {
      return this.onSubmit_e2b4fd$_0;
    },
    set: function (onSubmit) {
      this.onSubmit_e2b4fd$_0 = onSubmit;
    }
  });
  Object.defineProperty(FormData.prototype, 'onError', {
    get: function () {
      return this.onError_8x31st$_0;
    },
    set: function (onError) {
      this.onError_8x31st$_0 = onError;
    }
  });
  Object.defineProperty(FormData.prototype, 'validate', {
    get: function () {
      return this.validate_nmlhu0$_0;
    },
    set: function (validate) {
      this.validate_nmlhu0$_0 = validate;
    }
  });
  Object.defineProperty(FormData.prototype, 'transformErrors', {
    get: function () {
      return this.transformErrors_e98hkh$_0;
    },
    set: function (transformErrors) {
      this.transformErrors_e98hkh$_0 = transformErrors;
    }
  });
  function FormData_init$lambda(it) {
    return Unit;
  }
  function FormData_init$lambda_0(it) {
    return Unit;
  }
  function FormData_init$lambda_1(it) {
    return Unit;
  }
  function FormData_init$lambda_2(f, e) {
    return e;
  }
  function FormData_init$lambda_3(e) {
    return e;
  }
  FormData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'FormData',
    interfaces: [FormProps]
  };
  FormData.prototype.component1 = function () {
    return this.schema;
  };
  FormData.prototype.component2 = function () {
    return this.formData;
  };
  FormData.prototype.component3 = function () {
    return this.onChange;
  };
  FormData.prototype.component4 = function () {
    return this.onSubmit;
  };
  FormData.prototype.component5 = function () {
    return this.onError;
  };
  FormData.prototype.component6 = function () {
    return this.validate;
  };
  FormData.prototype.component7 = function () {
    return this.transformErrors;
  };
  FormData.prototype.copy_puk706$ = function (schema, formData, onChange, onSubmit, onError, validate, transformErrors) {
    return new FormData(schema === void 0 ? this.schema : schema, formData === void 0 ? this.formData : formData, onChange === void 0 ? this.onChange : onChange, onSubmit === void 0 ? this.onSubmit : onSubmit, onError === void 0 ? this.onError : onError, validate === void 0 ? this.validate : validate, transformErrors === void 0 ? this.transformErrors : transformErrors);
  };
  FormData.prototype.toString = function () {
    return 'FormData(schema=' + Kotlin.toString(this.schema) + (', formData=' + Kotlin.toString(this.formData)) + (', onChange=' + Kotlin.toString(this.onChange)) + (', onSubmit=' + Kotlin.toString(this.onSubmit)) + (', onError=' + Kotlin.toString(this.onError)) + (', validate=' + Kotlin.toString(this.validate)) + (', transformErrors=' + Kotlin.toString(this.transformErrors)) + ')';
  };
  FormData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.schema) | 0;
    result = result * 31 + Kotlin.hashCode(this.formData) | 0;
    result = result * 31 + Kotlin.hashCode(this.onChange) | 0;
    result = result * 31 + Kotlin.hashCode(this.onSubmit) | 0;
    result = result * 31 + Kotlin.hashCode(this.onError) | 0;
    result = result * 31 + Kotlin.hashCode(this.validate) | 0;
    result = result * 31 + Kotlin.hashCode(this.transformErrors) | 0;
    return result;
  };
  FormData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.schema, other.schema) && Kotlin.equals(this.formData, other.formData) && Kotlin.equals(this.onChange, other.onChange) && Kotlin.equals(this.onSubmit, other.onSubmit) && Kotlin.equals(this.onError, other.onError) && Kotlin.equals(this.validate, other.validate) && Kotlin.equals(this.transformErrors, other.transformErrors)))));
  };
  function form$lambda$ObjectLiteral(closure$props) {
    this.schema = closure$props.schema;
    this.onChange = closure$props.onChange;
    this.onError = closure$props.onError;
    this.onSubmit = closure$props.onSubmit;
    this.validate = closure$props.validate;
    this.transformErrors = closure$props.transformErrors;
  }
  form$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function form($receiver, props) {
    var form = createElement($module$react_jsonschema_form.default, new form$lambda$ObjectLiteral(props));
    return $receiver.child_2usv9w$(form);
  }
  function button$lambda$lambda(closure$data, closure$onClick) {
    return function ($receiver) {
      var tmp$, tmp$_0, tmp$_1;
      $receiver.waves = closure$data.waves;
      $receiver.floating = closure$data.floating;
      $receiver.onClick = closure$onClick;
      $receiver.node = (tmp$ = closure$data.node) != null ? tmp$ : undefined;
      $receiver.href = (tmp$_0 = closure$data.href) != null ? tmp$_0 : undefined;
      $receiver.className = (tmp$_1 = closure$data.className) != null ? tmp$_1 : undefined;
      return Unit;
    };
  }
  function button$lambda(closure$data, closure$onClick, closure$text) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(button$lambda$lambda(closure$data, closure$onClick));
      $receiver.unaryPlus_pdl1vz$(closure$text);
      return Unit;
    };
  }
  function button($receiver, text, data, onClick) {
    if (data === void 0)
      data = new ButtonData();
    return $receiver.child_bzgiuu$(getKClass(Button), button$lambda(data, onClick, text));
  }
  function navBar$lambda$lambda$ObjectLiteral(closure$data) {
    this.to = closure$data.href;
  }
  navBar$lambda$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function navBar$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.brand = createElement(get_js(getKClass(Link)), new navBar$lambda$lambda$ObjectLiteral(closure$data), closure$data.text);
      $receiver.right = closure$data.right;
      $receiver.left = closure$data.left;
      $receiver.fixed = closure$data.fixed;
      return Unit;
    };
  }
  function navBar$lambda(closure$data, closure$handler) {
    return function ($receiver) {
      navBrandCentralizer($receiver);
      $receiver.attrs_slhiwc$(navBar$lambda$lambda(closure$data));
      closure$handler($receiver);
      return Unit;
    };
  }
  function navBar($receiver, data, handler) {
    return $receiver.child_bzgiuu$(getKClass(NavBar), navBar$lambda(data, handler));
  }
  function navItem$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.onClick = closure$data.onClick;
      $receiver.divider = closure$data.divider;
      return Unit;
    };
  }
  function navItem$lambda(closure$data, closure$handler) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(navItem$lambda$lambda(closure$data));
      closure$handler($receiver);
      return Unit;
    };
  }
  function navItem($receiver, data, handler) {
    return $receiver.child_bzgiuu$(getKClass(NavItem), navItem$lambda(data, handler));
  }
  function parallax$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.imageSrc = closure$data.imageSrc;
      return Unit;
    };
  }
  function parallax$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(parallax$lambda$lambda(closure$data));
      return Unit;
    };
  }
  function parallax($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Parallax), parallax$lambda(data));
  }
  function input$lambda$lambda(closure$data) {
    return function ($receiver) {
      var tmp$;
      $receiver.label = closure$data.label;
      $receiver.placeholder = (tmp$ = closure$data.placeholder) != null ? tmp$ : undefined;
      $receiver.type = closure$data.type;
      $receiver.onChange = closure$data.onChange;
      $receiver.icon = closure$data.icon;
      return Unit;
    };
  }
  function input$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(input$lambda$lambda(closure$data));
      return Unit;
    };
  }
  function input($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Input), input$lambda(data));
  }
  function card$lambda$lambda(closure$data) {
    return function ($receiver) {
      var tmp$;
      $receiver.reveal = (tmp$ = closure$data.reveal) != null ? tmp$ : undefined;
      $receiver.title = closure$data.title;
      return Unit;
    };
  }
  function card$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(card$lambda$lambda(closure$data));
      if (closure$data.headerData != null)
        cardTitle($receiver, ensureNotNull(closure$data.headerData));
      closure$data.child($receiver);
      return Unit;
    };
  }
  function card($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Card), card$lambda(data));
  }
  function cardTitle$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.image = closure$data.image;
      $receiver.reveal = closure$data.reveal;
      $receiver.waves = closure$data.waves;
      return Unit;
    };
  }
  function cardTitle$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(cardTitle$lambda$lambda(closure$data));
      $receiver.unaryPlus_pdl1vz$(closure$data.text);
      return Unit;
    };
  }
  function cardTitle($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(CardTitle), cardTitle$lambda(data));
  }
  function row$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.className = closure$data.className;
      return Unit;
    };
  }
  function row$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(row$lambda$lambda(closure$data));
      var tmp$;
      tmp$ = closure$data.children.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        col($receiver, element);
      }
      return Unit;
    };
  }
  function row($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Row), row$lambda(data));
  }
  function col$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.s = closure$data.s;
      $receiver.m = closure$data.m;
      $receiver.l = closure$data.l;
      $receiver.className = closure$data.className;
      return Unit;
    };
  }
  function col$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(col$lambda$lambda(closure$data));
      closure$data.handler($receiver);
      return Unit;
    };
  }
  function col($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Col), col$lambda(data));
  }
  function footer$lambda$lambda(closure$data) {
    return function ($receiver) {
      $receiver.copyrights = closure$data.copyrights;
      $receiver.links = closure$data.links;
      $receiver.moreLinks = closure$data.moreLinks;
      return Unit;
    };
  }
  function footer$lambda(closure$data) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(footer$lambda$lambda(closure$data));
      closure$data.children($receiver);
      return Unit;
    };
  }
  function footer($receiver, data) {
    return $receiver.child_bzgiuu$(getKClass(Footer), footer$lambda(data));
  }
  function icon$lambda$lambda(closure$data, closure$children) {
    return function ($receiver) {
      $receiver.left = closure$data.left;
      $receiver.center = closure$data.center;
      $receiver.right = closure$data.right;
      $receiver.tiny = closure$data.tiny;
      $receiver.small = closure$data.small;
      $receiver.medium = closure$data.medium;
      $receiver.large = closure$data.large;
      $receiver.children = closure$children;
      return Unit;
    };
  }
  function icon$lambda(closure$data, closure$children) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(icon$lambda$lambda(closure$data, closure$children));
      return Unit;
    };
  }
  function icon($receiver, data, children) {
    if (data === void 0)
      data = new IconData();
    return $receiver.child_bzgiuu$(getKClass(Icon), icon$lambda(data, children));
  }
  function ButtonDataProps() {
  }
  ButtonDataProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ButtonDataProps',
    interfaces: []
  };
  function ButtonProps() {
  }
  ButtonProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ButtonProps',
    interfaces: [ButtonDataProps]
  };
  function ButtonData(waves, floating, node, href, className) {
    if (waves === void 0)
      waves = 'light';
    if (floating === void 0)
      floating = false;
    if (node === void 0)
      node = null;
    if (href === void 0)
      href = null;
    if (className === void 0)
      className = '';
    this.waves_tklzdd$_0 = waves;
    this.floating_8u9r6r$_0 = floating;
    this.node_jsr7kp$_0 = node;
    this.href_jw01eq$_0 = href;
    this.className_1jggo8$_0 = className;
  }
  Object.defineProperty(ButtonData.prototype, 'waves', {
    get: function () {
      return this.waves_tklzdd$_0;
    },
    set: function (waves) {
      this.waves_tklzdd$_0 = waves;
    }
  });
  Object.defineProperty(ButtonData.prototype, 'floating', {
    get: function () {
      return this.floating_8u9r6r$_0;
    },
    set: function (floating) {
      this.floating_8u9r6r$_0 = floating;
    }
  });
  Object.defineProperty(ButtonData.prototype, 'node', {
    get: function () {
      return this.node_jsr7kp$_0;
    },
    set: function (node) {
      this.node_jsr7kp$_0 = node;
    }
  });
  Object.defineProperty(ButtonData.prototype, 'href', {
    get: function () {
      return this.href_jw01eq$_0;
    },
    set: function (href) {
      this.href_jw01eq$_0 = href;
    }
  });
  Object.defineProperty(ButtonData.prototype, 'className', {
    get: function () {
      return this.className_1jggo8$_0;
    },
    set: function (className) {
      this.className_1jggo8$_0 = className;
    }
  });
  ButtonData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ButtonData',
    interfaces: [ButtonDataProps]
  };
  ButtonData.prototype.component1 = function () {
    return this.waves;
  };
  ButtonData.prototype.component2 = function () {
    return this.floating;
  };
  ButtonData.prototype.component3 = function () {
    return this.node;
  };
  ButtonData.prototype.component4 = function () {
    return this.href;
  };
  ButtonData.prototype.component5 = function () {
    return this.className;
  };
  ButtonData.prototype.copy_9v4vz8$ = function (waves, floating, node, href, className) {
    return new ButtonData(waves === void 0 ? this.waves : waves, floating === void 0 ? this.floating : floating, node === void 0 ? this.node : node, href === void 0 ? this.href : href, className === void 0 ? this.className : className);
  };
  ButtonData.prototype.toString = function () {
    return 'ButtonData(waves=' + Kotlin.toString(this.waves) + (', floating=' + Kotlin.toString(this.floating)) + (', node=' + Kotlin.toString(this.node)) + (', href=' + Kotlin.toString(this.href)) + (', className=' + Kotlin.toString(this.className)) + ')';
  };
  ButtonData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.waves) | 0;
    result = result * 31 + Kotlin.hashCode(this.floating) | 0;
    result = result * 31 + Kotlin.hashCode(this.node) | 0;
    result = result * 31 + Kotlin.hashCode(this.href) | 0;
    result = result * 31 + Kotlin.hashCode(this.className) | 0;
    return result;
  };
  ButtonData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.waves, other.waves) && Kotlin.equals(this.floating, other.floating) && Kotlin.equals(this.node, other.node) && Kotlin.equals(this.href, other.href) && Kotlin.equals(this.className, other.className)))));
  };
  function CardProps() {
  }
  CardProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'CardProps',
    interfaces: []
  };
  function CardTitleProps() {
  }
  CardTitleProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'CardTitleProps',
    interfaces: []
  };
  function CardData(title, reveal, offset, header, headerData, child) {
    if (reveal === void 0)
      reveal = null;
    if (offset === void 0)
      offset = '';
    if (header === void 0)
      header = null;
    if (headerData === void 0)
      headerData = null;
    this.title_xuxxf9$_0 = title;
    this.reveal_nzn10a$_0 = reveal;
    this.offset_jt1vsc$_0 = offset;
    this.header_iyc2e2$_0 = header;
    this.headerData = headerData;
    this.child = child;
  }
  Object.defineProperty(CardData.prototype, 'title', {
    get: function () {
      return this.title_xuxxf9$_0;
    },
    set: function (title) {
      this.title_xuxxf9$_0 = title;
    }
  });
  Object.defineProperty(CardData.prototype, 'reveal', {
    get: function () {
      return this.reveal_nzn10a$_0;
    },
    set: function (reveal) {
      this.reveal_nzn10a$_0 = reveal;
    }
  });
  Object.defineProperty(CardData.prototype, 'offset', {
    get: function () {
      return this.offset_jt1vsc$_0;
    },
    set: function (offset) {
      this.offset_jt1vsc$_0 = offset;
    }
  });
  Object.defineProperty(CardData.prototype, 'header', {
    get: function () {
      return this.header_iyc2e2$_0;
    },
    set: function (header) {
      this.header_iyc2e2$_0 = header;
    }
  });
  CardData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CardData',
    interfaces: [CardProps]
  };
  CardData.prototype.component1 = function () {
    return this.title;
  };
  CardData.prototype.component2 = function () {
    return this.reveal;
  };
  CardData.prototype.component3 = function () {
    return this.offset;
  };
  CardData.prototype.component4 = function () {
    return this.header;
  };
  CardData.prototype.component5 = function () {
    return this.headerData;
  };
  CardData.prototype.component6 = function () {
    return this.child;
  };
  CardData.prototype.copy_qzby8w$ = function (title, reveal, offset, header, headerData, child) {
    return new CardData(title === void 0 ? this.title : title, reveal === void 0 ? this.reveal : reveal, offset === void 0 ? this.offset : offset, header === void 0 ? this.header : header, headerData === void 0 ? this.headerData : headerData, child === void 0 ? this.child : child);
  };
  CardData.prototype.toString = function () {
    return 'CardData(title=' + Kotlin.toString(this.title) + (', reveal=' + Kotlin.toString(this.reveal)) + (', offset=' + Kotlin.toString(this.offset)) + (', header=' + Kotlin.toString(this.header)) + (', headerData=' + Kotlin.toString(this.headerData)) + (', child=' + Kotlin.toString(this.child)) + ')';
  };
  CardData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.title) | 0;
    result = result * 31 + Kotlin.hashCode(this.reveal) | 0;
    result = result * 31 + Kotlin.hashCode(this.offset) | 0;
    result = result * 31 + Kotlin.hashCode(this.header) | 0;
    result = result * 31 + Kotlin.hashCode(this.headerData) | 0;
    result = result * 31 + Kotlin.hashCode(this.child) | 0;
    return result;
  };
  CardData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.title, other.title) && Kotlin.equals(this.reveal, other.reveal) && Kotlin.equals(this.offset, other.offset) && Kotlin.equals(this.header, other.header) && Kotlin.equals(this.headerData, other.headerData) && Kotlin.equals(this.child, other.child)))));
  };
  function CardTitleData(waves, reveal, image, text) {
    if (waves === void 0)
      waves = 'light';
    if (reveal === void 0)
      reveal = true;
    this.waves_a3qwu5$_0 = waves;
    this.reveal_sn0uds$_0 = reveal;
    this.image_3nccv0$_0 = image;
    this.text = text;
  }
  Object.defineProperty(CardTitleData.prototype, 'waves', {
    get: function () {
      return this.waves_a3qwu5$_0;
    },
    set: function (waves) {
      this.waves_a3qwu5$_0 = waves;
    }
  });
  Object.defineProperty(CardTitleData.prototype, 'reveal', {
    get: function () {
      return this.reveal_sn0uds$_0;
    },
    set: function (reveal) {
      this.reveal_sn0uds$_0 = reveal;
    }
  });
  Object.defineProperty(CardTitleData.prototype, 'image', {
    get: function () {
      return this.image_3nccv0$_0;
    },
    set: function (image) {
      this.image_3nccv0$_0 = image;
    }
  });
  CardTitleData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CardTitleData',
    interfaces: [CardTitleProps]
  };
  CardTitleData.prototype.component1 = function () {
    return this.waves;
  };
  CardTitleData.prototype.component2 = function () {
    return this.reveal;
  };
  CardTitleData.prototype.component3 = function () {
    return this.image;
  };
  CardTitleData.prototype.component4 = function () {
    return this.text;
  };
  CardTitleData.prototype.copy_tqunl9$ = function (waves, reveal, image, text) {
    return new CardTitleData(waves === void 0 ? this.waves : waves, reveal === void 0 ? this.reveal : reveal, image === void 0 ? this.image : image, text === void 0 ? this.text : text);
  };
  CardTitleData.prototype.toString = function () {
    return 'CardTitleData(waves=' + Kotlin.toString(this.waves) + (', reveal=' + Kotlin.toString(this.reveal)) + (', image=' + Kotlin.toString(this.image)) + (', text=' + Kotlin.toString(this.text)) + ')';
  };
  CardTitleData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.waves) | 0;
    result = result * 31 + Kotlin.hashCode(this.reveal) | 0;
    result = result * 31 + Kotlin.hashCode(this.image) | 0;
    result = result * 31 + Kotlin.hashCode(this.text) | 0;
    return result;
  };
  CardTitleData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.waves, other.waves) && Kotlin.equals(this.reveal, other.reveal) && Kotlin.equals(this.image, other.image) && Kotlin.equals(this.text, other.text)))));
  };
  function FooterProps() {
  }
  FooterProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'FooterProps',
    interfaces: []
  };
  function FooterData(copyrights, links, moreLinks, children) {
    this.copyrights_z94g5i$_0 = copyrights;
    this.links_q1dxqh$_0 = links;
    this.moreLinks_cm1u4e$_0 = moreLinks;
    this.children = children;
  }
  Object.defineProperty(FooterData.prototype, 'copyrights', {
    get: function () {
      return this.copyrights_z94g5i$_0;
    },
    set: function (copyrights) {
      this.copyrights_z94g5i$_0 = copyrights;
    }
  });
  Object.defineProperty(FooterData.prototype, 'links', {
    get: function () {
      return this.links_q1dxqh$_0;
    },
    set: function (links) {
      this.links_q1dxqh$_0 = links;
    }
  });
  Object.defineProperty(FooterData.prototype, 'moreLinks', {
    get: function () {
      return this.moreLinks_cm1u4e$_0;
    },
    set: function (moreLinks) {
      this.moreLinks_cm1u4e$_0 = moreLinks;
    }
  });
  FooterData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'FooterData',
    interfaces: [FooterProps]
  };
  FooterData.prototype.component1 = function () {
    return this.copyrights;
  };
  FooterData.prototype.component2 = function () {
    return this.links;
  };
  FooterData.prototype.component3 = function () {
    return this.moreLinks;
  };
  FooterData.prototype.component4 = function () {
    return this.children;
  };
  FooterData.prototype.copy_tnuv9z$ = function (copyrights, links, moreLinks, children) {
    return new FooterData(copyrights === void 0 ? this.copyrights : copyrights, links === void 0 ? this.links : links, moreLinks === void 0 ? this.moreLinks : moreLinks, children === void 0 ? this.children : children);
  };
  FooterData.prototype.toString = function () {
    return 'FooterData(copyrights=' + Kotlin.toString(this.copyrights) + (', links=' + Kotlin.toString(this.links)) + (', moreLinks=' + Kotlin.toString(this.moreLinks)) + (', children=' + Kotlin.toString(this.children)) + ')';
  };
  FooterData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.copyrights) | 0;
    result = result * 31 + Kotlin.hashCode(this.links) | 0;
    result = result * 31 + Kotlin.hashCode(this.moreLinks) | 0;
    result = result * 31 + Kotlin.hashCode(this.children) | 0;
    return result;
  };
  FooterData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.copyrights, other.copyrights) && Kotlin.equals(this.links, other.links) && Kotlin.equals(this.moreLinks, other.moreLinks) && Kotlin.equals(this.children, other.children)))));
  };
  function createLinks$lambda$ObjectLiteral(closure$it) {
    this.key = closure$it.second;
  }
  createLinks$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function createLinks$lambda$ObjectLiteral_0(closure$it) {
    this.href = closure$it.first;
  }
  createLinks$lambda$ObjectLiteral_0.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function createLinks$ObjectLiteral() {
  }
  createLinks$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  var collectionSizeOrDefault = Kotlin.kotlin.collections.collectionSizeOrDefault_ba2ldo$;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  var copyToArray = Kotlin.kotlin.collections.copyToArray;
  function createLinks(links) {
    var destination = ArrayList_init(collectionSizeOrDefault(links, 10));
    var tmp$;
    tmp$ = links.iterator();
    while (tmp$.hasNext()) {
      var item = tmp$.next();
      destination.add_11rb$(createElement('li', new createLinks$lambda$ObjectLiteral(item), createElement('a', new createLinks$lambda$ObjectLiteral_0(item), item.second)));
    }
    var listEntries = copyToArray(destination);
    return createElement('ul', new createLinks$ObjectLiteral(), listEntries);
  }
  function RowProps() {
  }
  RowProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'RowProps',
    interfaces: []
  };
  function ColProps() {
  }
  ColProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ColProps',
    interfaces: []
  };
  var emptyList = Kotlin.kotlin.collections.emptyList_287e2$;
  function RowData(children, className) {
    if (children === void 0) {
      children = emptyList();
    }
    if (className === void 0)
      className = '';
    this.children = children;
    this.className_nafpzy$_0 = className;
  }
  Object.defineProperty(RowData.prototype, 'className', {
    get: function () {
      return this.className_nafpzy$_0;
    },
    set: function (className) {
      this.className_nafpzy$_0 = className;
    }
  });
  RowData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'RowData',
    interfaces: [RowProps]
  };
  RowData.prototype.component1 = function () {
    return this.children;
  };
  RowData.prototype.component2 = function () {
    return this.className;
  };
  RowData.prototype.copy_fr8in9$ = function (children, className) {
    return new RowData(children === void 0 ? this.children : children, className === void 0 ? this.className : className);
  };
  RowData.prototype.toString = function () {
    return 'RowData(children=' + Kotlin.toString(this.children) + (', className=' + Kotlin.toString(this.className)) + ')';
  };
  RowData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.children) | 0;
    result = result * 31 + Kotlin.hashCode(this.className) | 0;
    return result;
  };
  RowData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.children, other.children) && Kotlin.equals(this.className, other.className)))));
  };
  function ColData(s, m, l, className, handler) {
    if (s === void 0)
      s = 0;
    if (m === void 0)
      m = 0;
    if (l === void 0)
      l = 0;
    if (className === void 0)
      className = null;
    this.s_ronnjg$_0 = s;
    this.m_ronnea$_0 = m;
    this.l_ronndf$_0 = l;
    this.className_wt4kzg$_0 = className;
    this.handler = handler;
  }
  Object.defineProperty(ColData.prototype, 's', {
    get: function () {
      return this.s_ronnjg$_0;
    },
    set: function (s) {
      this.s_ronnjg$_0 = s;
    }
  });
  Object.defineProperty(ColData.prototype, 'm', {
    get: function () {
      return this.m_ronnea$_0;
    },
    set: function (m) {
      this.m_ronnea$_0 = m;
    }
  });
  Object.defineProperty(ColData.prototype, 'l', {
    get: function () {
      return this.l_ronndf$_0;
    },
    set: function (l) {
      this.l_ronndf$_0 = l;
    }
  });
  Object.defineProperty(ColData.prototype, 'className', {
    get: function () {
      return this.className_wt4kzg$_0;
    },
    set: function (className) {
      this.className_wt4kzg$_0 = className;
    }
  });
  ColData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ColData',
    interfaces: [ColProps]
  };
  ColData.prototype.component1 = function () {
    return this.s;
  };
  ColData.prototype.component2 = function () {
    return this.m;
  };
  ColData.prototype.component3 = function () {
    return this.l;
  };
  ColData.prototype.component4 = function () {
    return this.className;
  };
  ColData.prototype.component5 = function () {
    return this.handler;
  };
  ColData.prototype.copy_e9zgh6$ = function (s, m, l, className, handler) {
    return new ColData(s === void 0 ? this.s : s, m === void 0 ? this.m : m, l === void 0 ? this.l : l, className === void 0 ? this.className : className, handler === void 0 ? this.handler : handler);
  };
  ColData.prototype.toString = function () {
    return 'ColData(s=' + Kotlin.toString(this.s) + (', m=' + Kotlin.toString(this.m)) + (', l=' + Kotlin.toString(this.l)) + (', className=' + Kotlin.toString(this.className)) + (', handler=' + Kotlin.toString(this.handler)) + ')';
  };
  ColData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.s) | 0;
    result = result * 31 + Kotlin.hashCode(this.m) | 0;
    result = result * 31 + Kotlin.hashCode(this.l) | 0;
    result = result * 31 + Kotlin.hashCode(this.className) | 0;
    result = result * 31 + Kotlin.hashCode(this.handler) | 0;
    return result;
  };
  ColData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.s, other.s) && Kotlin.equals(this.m, other.m) && Kotlin.equals(this.l, other.l) && Kotlin.equals(this.className, other.className) && Kotlin.equals(this.handler, other.handler)))));
  };
  function IconDataProps() {
  }
  IconDataProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'IconDataProps',
    interfaces: []
  };
  function IconProps() {
  }
  IconProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'IconProps',
    interfaces: [IconDataProps]
  };
  function IconData(className, left, center, right, tiny, small, medium, large) {
    if (className === void 0)
      className = '';
    if (left === void 0)
      left = false;
    if (center === void 0)
      center = false;
    if (right === void 0)
      right = false;
    if (tiny === void 0)
      tiny = false;
    if (small === void 0)
      small = false;
    if (medium === void 0)
      medium = false;
    if (large === void 0)
      large = false;
    this.className_4ncn41$_0 = className;
    this.left_aztdft$_0 = left;
    this.center_7flk1x$_0 = center;
    this.right_besd08$_0 = right;
    this.tiny_b4ag6o$_0 = tiny;
    this.small_avnbdv$_0 = small;
    this.medium_2vjgth$_0 = medium;
    this.large_ed9gd3$_0 = large;
  }
  Object.defineProperty(IconData.prototype, 'className', {
    get: function () {
      return this.className_4ncn41$_0;
    },
    set: function (className) {
      this.className_4ncn41$_0 = className;
    }
  });
  Object.defineProperty(IconData.prototype, 'left', {
    get: function () {
      return this.left_aztdft$_0;
    },
    set: function (left) {
      this.left_aztdft$_0 = left;
    }
  });
  Object.defineProperty(IconData.prototype, 'center', {
    get: function () {
      return this.center_7flk1x$_0;
    },
    set: function (center) {
      this.center_7flk1x$_0 = center;
    }
  });
  Object.defineProperty(IconData.prototype, 'right', {
    get: function () {
      return this.right_besd08$_0;
    },
    set: function (right) {
      this.right_besd08$_0 = right;
    }
  });
  Object.defineProperty(IconData.prototype, 'tiny', {
    get: function () {
      return this.tiny_b4ag6o$_0;
    },
    set: function (tiny) {
      this.tiny_b4ag6o$_0 = tiny;
    }
  });
  Object.defineProperty(IconData.prototype, 'small', {
    get: function () {
      return this.small_avnbdv$_0;
    },
    set: function (small) {
      this.small_avnbdv$_0 = small;
    }
  });
  Object.defineProperty(IconData.prototype, 'medium', {
    get: function () {
      return this.medium_2vjgth$_0;
    },
    set: function (medium) {
      this.medium_2vjgth$_0 = medium;
    }
  });
  Object.defineProperty(IconData.prototype, 'large', {
    get: function () {
      return this.large_ed9gd3$_0;
    },
    set: function (large) {
      this.large_ed9gd3$_0 = large;
    }
  });
  IconData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'IconData',
    interfaces: [IconDataProps]
  };
  IconData.prototype.component1 = function () {
    return this.className;
  };
  IconData.prototype.component2 = function () {
    return this.left;
  };
  IconData.prototype.component3 = function () {
    return this.center;
  };
  IconData.prototype.component4 = function () {
    return this.right;
  };
  IconData.prototype.component5 = function () {
    return this.tiny;
  };
  IconData.prototype.component6 = function () {
    return this.small;
  };
  IconData.prototype.component7 = function () {
    return this.medium;
  };
  IconData.prototype.component8 = function () {
    return this.large;
  };
  IconData.prototype.copy_ti5b22$ = function (className, left, center, right, tiny, small, medium, large) {
    return new IconData(className === void 0 ? this.className : className, left === void 0 ? this.left : left, center === void 0 ? this.center : center, right === void 0 ? this.right : right, tiny === void 0 ? this.tiny : tiny, small === void 0 ? this.small : small, medium === void 0 ? this.medium : medium, large === void 0 ? this.large : large);
  };
  IconData.prototype.toString = function () {
    return 'IconData(className=' + Kotlin.toString(this.className) + (', left=' + Kotlin.toString(this.left)) + (', center=' + Kotlin.toString(this.center)) + (', right=' + Kotlin.toString(this.right)) + (', tiny=' + Kotlin.toString(this.tiny)) + (', small=' + Kotlin.toString(this.small)) + (', medium=' + Kotlin.toString(this.medium)) + (', large=' + Kotlin.toString(this.large)) + ')';
  };
  IconData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.className) | 0;
    result = result * 31 + Kotlin.hashCode(this.left) | 0;
    result = result * 31 + Kotlin.hashCode(this.center) | 0;
    result = result * 31 + Kotlin.hashCode(this.right) | 0;
    result = result * 31 + Kotlin.hashCode(this.tiny) | 0;
    result = result * 31 + Kotlin.hashCode(this.small) | 0;
    result = result * 31 + Kotlin.hashCode(this.medium) | 0;
    result = result * 31 + Kotlin.hashCode(this.large) | 0;
    return result;
  };
  IconData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.className, other.className) && Kotlin.equals(this.left, other.left) && Kotlin.equals(this.center, other.center) && Kotlin.equals(this.right, other.right) && Kotlin.equals(this.tiny, other.tiny) && Kotlin.equals(this.small, other.small) && Kotlin.equals(this.medium, other.medium) && Kotlin.equals(this.large, other.large)))));
  };
  function InputProps() {
  }
  InputProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'InputProps',
    interfaces: []
  };
  function InputData(label, placeholder, type, onChange, icon) {
    if (placeholder === void 0)
      placeholder = null;
    if (type === void 0)
      type = '';
    if (onChange === void 0)
      onChange = InputData_init$lambda;
    if (icon === void 0)
      icon = '';
    this.label_s5xpoh$_0 = label;
    this.placeholder_831yu6$_0 = placeholder;
    this.type_jkuie3$_0 = type;
    this.onChange_gw1jdc$_0 = onChange;
    this.icon_jrab5m$_0 = icon;
  }
  Object.defineProperty(InputData.prototype, 'label', {
    get: function () {
      return this.label_s5xpoh$_0;
    },
    set: function (label) {
      this.label_s5xpoh$_0 = label;
    }
  });
  Object.defineProperty(InputData.prototype, 'placeholder', {
    get: function () {
      return this.placeholder_831yu6$_0;
    },
    set: function (placeholder) {
      this.placeholder_831yu6$_0 = placeholder;
    }
  });
  Object.defineProperty(InputData.prototype, 'type', {
    get: function () {
      return this.type_jkuie3$_0;
    },
    set: function (type) {
      this.type_jkuie3$_0 = type;
    }
  });
  Object.defineProperty(InputData.prototype, 'onChange', {
    get: function () {
      return this.onChange_gw1jdc$_0;
    },
    set: function (onChange) {
      this.onChange_gw1jdc$_0 = onChange;
    }
  });
  Object.defineProperty(InputData.prototype, 'icon', {
    get: function () {
      return this.icon_jrab5m$_0;
    },
    set: function (icon) {
      this.icon_jrab5m$_0 = icon;
    }
  });
  function InputData_init$lambda(it) {
    return Unit;
  }
  InputData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'InputData',
    interfaces: [InputProps]
  };
  InputData.prototype.component1 = function () {
    return this.label;
  };
  InputData.prototype.component2 = function () {
    return this.placeholder;
  };
  InputData.prototype.component3 = function () {
    return this.type;
  };
  InputData.prototype.component4 = function () {
    return this.onChange;
  };
  InputData.prototype.component5 = function () {
    return this.icon;
  };
  InputData.prototype.copy_la5iw8$ = function (label, placeholder, type, onChange, icon) {
    return new InputData(label === void 0 ? this.label : label, placeholder === void 0 ? this.placeholder : placeholder, type === void 0 ? this.type : type, onChange === void 0 ? this.onChange : onChange, icon === void 0 ? this.icon : icon);
  };
  InputData.prototype.toString = function () {
    return 'InputData(label=' + Kotlin.toString(this.label) + (', placeholder=' + Kotlin.toString(this.placeholder)) + (', type=' + Kotlin.toString(this.type)) + (', onChange=' + Kotlin.toString(this.onChange)) + (', icon=' + Kotlin.toString(this.icon)) + ')';
  };
  InputData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.label) | 0;
    result = result * 31 + Kotlin.hashCode(this.placeholder) | 0;
    result = result * 31 + Kotlin.hashCode(this.type) | 0;
    result = result * 31 + Kotlin.hashCode(this.onChange) | 0;
    result = result * 31 + Kotlin.hashCode(this.icon) | 0;
    return result;
  };
  InputData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.label, other.label) && Kotlin.equals(this.placeholder, other.placeholder) && Kotlin.equals(this.type, other.type) && Kotlin.equals(this.onChange, other.onChange) && Kotlin.equals(this.icon, other.icon)))));
  };
  function NavProps() {
  }
  NavProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'NavProps',
    interfaces: []
  };
  function NavBarProps() {
  }
  NavBarProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'NavBarProps',
    interfaces: []
  };
  function NavItemProps() {
  }
  NavItemProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'NavItemProps',
    interfaces: []
  };
  function NavBarData(href, right, left, fixed, text, brand) {
    if (href === void 0)
      href = '/';
    if (right === void 0)
      right = true;
    if (left === void 0)
      left = false;
    if (fixed === void 0)
      fixed = true;
    if (brand === void 0)
      brand = null;
    this.href_pj40t8$_0 = href;
    this.right_eprixd$_0 = right;
    this.left_pl2xfk$_0 = left;
    this.fixed_91iud5$_0 = fixed;
    this.text_pphniy$_0 = text;
    this.brand_79w03q$_0 = brand;
  }
  Object.defineProperty(NavBarData.prototype, 'href', {
    get: function () {
      return this.href_pj40t8$_0;
    },
    set: function (href) {
      this.href_pj40t8$_0 = href;
    }
  });
  Object.defineProperty(NavBarData.prototype, 'right', {
    get: function () {
      return this.right_eprixd$_0;
    },
    set: function (right) {
      this.right_eprixd$_0 = right;
    }
  });
  Object.defineProperty(NavBarData.prototype, 'left', {
    get: function () {
      return this.left_pl2xfk$_0;
    },
    set: function (left) {
      this.left_pl2xfk$_0 = left;
    }
  });
  Object.defineProperty(NavBarData.prototype, 'fixed', {
    get: function () {
      return this.fixed_91iud5$_0;
    },
    set: function (fixed) {
      this.fixed_91iud5$_0 = fixed;
    }
  });
  Object.defineProperty(NavBarData.prototype, 'text', {
    get: function () {
      return this.text_pphniy$_0;
    },
    set: function (text) {
      this.text_pphniy$_0 = text;
    }
  });
  Object.defineProperty(NavBarData.prototype, 'brand', {
    get: function () {
      return this.brand_79w03q$_0;
    },
    set: function (brand) {
      this.brand_79w03q$_0 = brand;
    }
  });
  NavBarData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'NavBarData',
    interfaces: [NavBarProps]
  };
  NavBarData.prototype.component1 = function () {
    return this.href;
  };
  NavBarData.prototype.component2 = function () {
    return this.right;
  };
  NavBarData.prototype.component3 = function () {
    return this.left;
  };
  NavBarData.prototype.component4 = function () {
    return this.fixed;
  };
  NavBarData.prototype.component5 = function () {
    return this.text;
  };
  NavBarData.prototype.component6 = function () {
    return this.brand;
  };
  NavBarData.prototype.copy_hja5b6$ = function (href, right, left, fixed, text, brand) {
    return new NavBarData(href === void 0 ? this.href : href, right === void 0 ? this.right : right, left === void 0 ? this.left : left, fixed === void 0 ? this.fixed : fixed, text === void 0 ? this.text : text, brand === void 0 ? this.brand : brand);
  };
  NavBarData.prototype.toString = function () {
    return 'NavBarData(href=' + Kotlin.toString(this.href) + (', right=' + Kotlin.toString(this.right)) + (', left=' + Kotlin.toString(this.left)) + (', fixed=' + Kotlin.toString(this.fixed)) + (', text=' + Kotlin.toString(this.text)) + (', brand=' + Kotlin.toString(this.brand)) + ')';
  };
  NavBarData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.href) | 0;
    result = result * 31 + Kotlin.hashCode(this.right) | 0;
    result = result * 31 + Kotlin.hashCode(this.left) | 0;
    result = result * 31 + Kotlin.hashCode(this.fixed) | 0;
    result = result * 31 + Kotlin.hashCode(this.text) | 0;
    result = result * 31 + Kotlin.hashCode(this.brand) | 0;
    return result;
  };
  NavBarData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.href, other.href) && Kotlin.equals(this.right, other.right) && Kotlin.equals(this.left, other.left) && Kotlin.equals(this.fixed, other.fixed) && Kotlin.equals(this.text, other.text) && Kotlin.equals(this.brand, other.brand)))));
  };
  function NavItemData(onClick, divider) {
    if (onClick === void 0)
      onClick = NavItemData_init$lambda;
    if (divider === void 0)
      divider = false;
    this.onClick_cgcnmo$_0 = onClick;
    this.divider_nn2ths$_0 = divider;
  }
  Object.defineProperty(NavItemData.prototype, 'onClick', {
    get: function () {
      return this.onClick_cgcnmo$_0;
    },
    set: function (onClick) {
      this.onClick_cgcnmo$_0 = onClick;
    }
  });
  Object.defineProperty(NavItemData.prototype, 'divider', {
    get: function () {
      return this.divider_nn2ths$_0;
    },
    set: function (divider) {
      this.divider_nn2ths$_0 = divider;
    }
  });
  function NavItemData_init$lambda() {
    return Unit;
  }
  NavItemData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'NavItemData',
    interfaces: [NavItemProps]
  };
  NavItemData.prototype.component1 = function () {
    return this.onClick;
  };
  NavItemData.prototype.component2 = function () {
    return this.divider;
  };
  NavItemData.prototype.copy_s4oxmo$ = function (onClick, divider) {
    return new NavItemData(onClick === void 0 ? this.onClick : onClick, divider === void 0 ? this.divider : divider);
  };
  NavItemData.prototype.toString = function () {
    return 'NavItemData(onClick=' + Kotlin.toString(this.onClick) + (', divider=' + Kotlin.toString(this.divider)) + ')';
  };
  NavItemData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.onClick) | 0;
    result = result * 31 + Kotlin.hashCode(this.divider) | 0;
    return result;
  };
  NavItemData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.onClick, other.onClick) && Kotlin.equals(this.divider, other.divider)))));
  };
  function ParallaxProps() {
  }
  ParallaxProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ParallaxProps',
    interfaces: []
  };
  function ParallaxData(imageSrc) {
    this.imageSrc_ioc1y3$_0 = imageSrc;
  }
  Object.defineProperty(ParallaxData.prototype, 'imageSrc', {
    get: function () {
      return this.imageSrc_ioc1y3$_0;
    },
    set: function (imageSrc) {
      this.imageSrc_ioc1y3$_0 = imageSrc;
    }
  });
  ParallaxData.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ParallaxData',
    interfaces: [ParallaxProps]
  };
  ParallaxData.prototype.component1 = function () {
    return this.imageSrc;
  };
  ParallaxData.prototype.copy_61zpoe$ = function (imageSrc) {
    return new ParallaxData(imageSrc === void 0 ? this.imageSrc : imageSrc);
  };
  ParallaxData.prototype.toString = function () {
    return 'ParallaxData(imageSrc=' + Kotlin.toString(this.imageSrc) + ')';
  };
  ParallaxData.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.imageSrc) | 0;
    return result;
  };
  ParallaxData.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.imageSrc, other.imageSrc))));
  };
  function browserRouter$lambda$lambda(closure$basename) {
    return function ($receiver) {
      $receiver.basename = closure$basename;
      return Unit;
    };
  }
  function browserRouter$lambda(closure$basename, closure$handler) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(browserRouter$lambda$lambda(closure$basename));
      closure$handler($receiver);
      return Unit;
    };
  }
  function browserRouter($receiver, basename, handler) {
    if (basename === void 0)
      basename = '/';
    return $receiver.child_bzgiuu$(getKClass(BrowserRouter), browserRouter$lambda(basename, handler));
  }
  function switch_0($receiver, handler) {
    return $receiver.child_bzgiuu$(getKClass(Switch), handler);
  }
  function route$lambda$lambda(closure$path, closure$exact, closure$component) {
    return function ($receiver) {
      $receiver.path = closure$path;
      $receiver.exact = closure$exact;
      $receiver.component = get_js(closure$component);
      return Unit;
    };
  }
  function route$lambda(closure$path, closure$exact, closure$component) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(route$lambda$lambda(closure$path, closure$exact, closure$component));
      return Unit;
    };
  }
  function route($receiver, path, component, exact) {
    if (exact === void 0)
      exact = false;
    return $receiver.child_bzgiuu$(getKClass(Route), route$lambda(path, exact, component));
  }
  function link$lambda$lambda(closure$to) {
    return function ($receiver) {
      $receiver.to = closure$to;
      return Unit;
    };
  }
  function link$lambda(closure$to, closure$handler) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(link$lambda$lambda(closure$to));
      closure$handler($receiver);
      return Unit;
    };
  }
  function link($receiver, to, handler) {
    return $receiver.child_bzgiuu$(getKClass(Link), link$lambda(to, handler));
  }
  var questionRepo;
  function QuestionRepository() {
  }
  QuestionRepository.prototype.getNext_uk481n$ = function (schema, body, onResponse, callback$default) {
    if (body === void 0)
      body = json([]);
    callback$default ? callback$default(schema, body, onResponse) : this.getNext_uk481n$$default(schema, body, onResponse);
  };
  QuestionRepository.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'QuestionRepository',
    interfaces: []
  };
  function RemoteQuestionRepository() {
    this._base_0 = 'https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0';
    this._root_ubwl65$_0 = this._root_ubwl65$_0;
  }
  Object.defineProperty(RemoteQuestionRepository.prototype, '_root_0', {
    get: function () {
      if (this._root_ubwl65$_0 == null)
        return throwUPAE('_root');
      return this._root_ubwl65$_0;
    },
    set: function (_root) {
      this._root_ubwl65$_0 = _root;
    }
  });
  function RemoteQuestionRepository$root$lambda(it) {
    return Unit;
  }
  RemoteQuestionRepository.prototype.root = function () {
    this.rootAndThen_0(RemoteQuestionRepository$root$lambda);
  };
  function RemoteQuestionRepository$rootAndThen$lambda(this$RemoteQuestionRepository) {
    return function (response) {
      var schema = getSchema(toJson(response.data));
      this$RemoteQuestionRepository._root_0 = schema;
      return Unit;
    };
  }
  RemoteQuestionRepository.prototype.rootAndThen_0 = function (then) {
    console.log('starting root request for https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0/');
    RefResolver_getInstance().axiosRefResolver.get('https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0/').then(RemoteQuestionRepository$rootAndThen$lambda(this)).then(then);
  };
  function RemoteQuestionRepository$create$lambda(this$RemoteQuestionRepository, closure$onResponse) {
    return function () {
      var tmp$, tmp$_0;
      (tmp$_0 = (tmp$ = getLinkByRel(this$RemoteQuestionRepository._root_0, Relation$CREATE_getInstance())) != null ? axios(tmp$, this$RemoteQuestionRepository._base_0) : null) != null ? tmp$_0.then(closure$onResponse) : null;
      return Unit;
    };
  }
  RemoteQuestionRepository.prototype.create_7qpfje$ = function (onResponse) {
    this.safetyRootCall_0(RemoteQuestionRepository$create$lambda(this, onResponse));
  };
  function RemoteQuestionRepository$getById$lambda(this$RemoteQuestionRepository, closure$onResponse) {
    return function () {
      var tmp$, tmp$_0;
      (tmp$_0 = (tmp$ = getLinkByRel(this$RemoteQuestionRepository._root_0, Relation$BY_ID_getInstance())) != null ? axios(tmp$, this$RemoteQuestionRepository._base_0) : null) != null ? tmp$_0.then(closure$onResponse) : null;
      return Unit;
    };
  }
  RemoteQuestionRepository.prototype.getById_up196s$ = function (id, onResponse) {
    this.safetyRootCall_0(RemoteQuestionRepository$getById$lambda(this, onResponse));
  };
  RemoteQuestionRepository.prototype.getNext_uk481n$$default = function (schema, body, onResponse) {
    var tmp$, tmp$_0;
    (tmp$_0 = (tmp$ = getLinkByRel(schema, Relation$NEXT_getInstance())) != null ? axios(tmp$, this._base_0, body) : null) != null ? tmp$_0.then(onResponse) : null;
  };
  function RemoteQuestionRepository$safetyRootCall$lambda(closure$interactWithRoot) {
    return function (it) {
      closure$interactWithRoot();
      return Unit;
    };
  }
  RemoteQuestionRepository.prototype.safetyRootCall_0 = function (interactWithRoot) {
    var rootQueried = this._root_ubwl65$_0 != null;
    console.log('root was ' + (!rootQueried ? 'not ' : '') + 'queried before');
    if (!rootQueried)
      this.rootAndThen_0(RemoteQuestionRepository$safetyRootCall$lambda(interactWithRoot));
    else
      interactWithRoot();
  };
  RemoteQuestionRepository.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'RemoteQuestionRepository',
    interfaces: [QuestionRepository]
  };
  function RefResolver() {
    RefResolver_instance = this;
    this.axiosRefResolver = clone($module$axios);
    this.axiosRefResolver.interceptors.response.use(RefResolver_init$lambda);
  }
  function RefResolver_init$lambda$lambda$lambda(closure$resolve, closure$response) {
    return function () {
      closure$resolve(closure$response);
      return Unit;
    };
  }
  function RefResolver_init$lambda$lambda(closure$response) {
    return function (resolve, f) {
      closure$response.data = defaultReplacer(closure$response.data, RefResolver_init$lambda$lambda$lambda(resolve, closure$response));
      return Unit;
    };
  }
  function RefResolver_init$lambda(response) {
    var promise = new Promise(RefResolver_init$lambda$lambda(response));
    return promise;
  }
  RefResolver.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'RefResolver',
    interfaces: []
  };
  var RefResolver_instance = null;
  function RefResolver_getInstance() {
    if (RefResolver_instance === null) {
      new RefResolver();
    }
    return RefResolver_instance;
  }
  function Relation(name, ordinal, _rel) {
    Enum.call(this);
    this._rel_nd8nej$_0 = _rel;
    this.name$ = name;
    this.ordinal$ = ordinal;
  }
  function Relation_initFields() {
    Relation_initFields = function () {
    };
    Relation$CREATE_instance = new Relation('CREATE', 0, 'create');
    Relation$BY_ID_instance = new Relation('BY_ID', 1, 'get-by-id');
    Relation$NEXT_instance = new Relation('NEXT', 2, 'next');
  }
  var Relation$CREATE_instance;
  function Relation$CREATE_getInstance() {
    Relation_initFields();
    return Relation$CREATE_instance;
  }
  var Relation$BY_ID_instance;
  function Relation$BY_ID_getInstance() {
    Relation_initFields();
    return Relation$BY_ID_instance;
  }
  var Relation$NEXT_instance;
  function Relation$NEXT_getInstance() {
    Relation_initFields();
    return Relation$NEXT_instance;
  }
  Relation.prototype.toString = function () {
    return this._rel_nd8nej$_0;
  };
  Relation.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Relation',
    interfaces: [Enum]
  };
  function Relation$values() {
    return [Relation$CREATE_getInstance(), Relation$BY_ID_getInstance(), Relation$NEXT_getInstance()];
  }
  Relation.values = Relation$values;
  function Relation$valueOf(name) {
    switch (name) {
      case 'CREATE':
        return Relation$CREATE_getInstance();
      case 'BY_ID':
        return Relation$BY_ID_getInstance();
      case 'NEXT':
        return Relation$NEXT_getInstance();
      default:throwISE('No enum constant network.schema.Relation.' + name);
    }
  }
  Relation.valueOf_61zpoe$ = Relation$valueOf;
  function Schema(links) {
    this.links = links;
  }
  Schema.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Schema',
    interfaces: []
  };
  Schema.prototype.component1 = function () {
    return this.links;
  };
  Schema.prototype.copy_8dapp1$ = function (links) {
    return new Schema(links === void 0 ? this.links : links);
  };
  Schema.prototype.toString = function () {
    return 'Schema(links=' + Kotlin.toString(this.links) + ')';
  };
  Schema.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.links) | 0;
    return result;
  };
  Schema.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.links, other.links))));
  };
  function Link_0(rel, href, method, targetSchema) {
    this.rel = rel;
    this.href = href;
    this.method = method;
    this.targetSchema = targetSchema;
  }
  Link_0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Link',
    interfaces: []
  };
  Link_0.prototype.component1 = function () {
    return this.rel;
  };
  Link_0.prototype.component2 = function () {
    return this.href;
  };
  Link_0.prototype.component3 = function () {
    return this.method;
  };
  Link_0.prototype.component4 = function () {
    return this.targetSchema;
  };
  Link_0.prototype.copy_l065dn$ = function (rel, href, method, targetSchema) {
    return new Link_0(rel === void 0 ? this.rel : rel, href === void 0 ? this.href : href, method === void 0 ? this.method : method, targetSchema === void 0 ? this.targetSchema : targetSchema);
  };
  Link_0.prototype.toString = function () {
    return 'Link(rel=' + Kotlin.toString(this.rel) + (', href=' + Kotlin.toString(this.href)) + (', method=' + Kotlin.toString(this.method)) + (', targetSchema=' + Kotlin.toString(this.targetSchema)) + ')';
  };
  Link_0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.rel) | 0;
    result = result * 31 + Kotlin.hashCode(this.href) | 0;
    result = result * 31 + Kotlin.hashCode(this.method) | 0;
    result = result * 31 + Kotlin.hashCode(this.targetSchema) | 0;
    return result;
  };
  Link_0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.rel, other.rel) && Kotlin.equals(this.href, other.href) && Kotlin.equals(this.method, other.method) && Kotlin.equals(this.targetSchema, other.targetSchema)))));
  };
  function Method(name, ordinal) {
    Enum.call(this);
    this.name$ = name;
    this.ordinal$ = ordinal;
  }
  function Method_initFields() {
    Method_initFields = function () {
    };
    Method$GET_instance = new Method('GET', 0);
    Method$POST_instance = new Method('POST', 1);
    Method$PUT_instance = new Method('PUT', 2);
    Method$DELETE_instance = new Method('DELETE', 3);
    Method$PATCH_instance = new Method('PATCH', 4);
    Method$OPTIONS_instance = new Method('OPTIONS', 5);
    Method$HEAD_instance = new Method('HEAD', 6);
  }
  var Method$GET_instance;
  function Method$GET_getInstance() {
    Method_initFields();
    return Method$GET_instance;
  }
  var Method$POST_instance;
  function Method$POST_getInstance() {
    Method_initFields();
    return Method$POST_instance;
  }
  var Method$PUT_instance;
  function Method$PUT_getInstance() {
    Method_initFields();
    return Method$PUT_instance;
  }
  var Method$DELETE_instance;
  function Method$DELETE_getInstance() {
    Method_initFields();
    return Method$DELETE_instance;
  }
  var Method$PATCH_instance;
  function Method$PATCH_getInstance() {
    Method_initFields();
    return Method$PATCH_instance;
  }
  var Method$OPTIONS_instance;
  function Method$OPTIONS_getInstance() {
    Method_initFields();
    return Method$OPTIONS_instance;
  }
  var Method$HEAD_instance;
  function Method$HEAD_getInstance() {
    Method_initFields();
    return Method$HEAD_instance;
  }
  Method.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Method',
    interfaces: [Enum]
  };
  function Method$values() {
    return [Method$GET_getInstance(), Method$POST_getInstance(), Method$PUT_getInstance(), Method$DELETE_getInstance(), Method$PATCH_getInstance(), Method$OPTIONS_getInstance(), Method$HEAD_getInstance()];
  }
  Method.values = Method$values;
  function Method$valueOf(name) {
    switch (name) {
      case 'GET':
        return Method$GET_getInstance();
      case 'POST':
        return Method$POST_getInstance();
      case 'PUT':
        return Method$PUT_getInstance();
      case 'DELETE':
        return Method$DELETE_getInstance();
      case 'PATCH':
        return Method$PATCH_getInstance();
      case 'OPTIONS':
        return Method$OPTIONS_getInstance();
      case 'HEAD':
        return Method$HEAD_getInstance();
      default:throwISE('No enum constant network.schema.Method.' + name);
    }
  }
  Method.valueOf_61zpoe$ = Method$valueOf;
  function axios($receiver, baseUrl, data) {
    if (baseUrl === void 0)
      baseUrl = '';
    if (data === void 0)
      data = json([]);
    var tmp$, tmp$_0;
    var url = baseUrl + $receiver.href;
    tmp$ = $receiver.method.toString();
    if (equals(tmp$, Method$GET_getInstance().name))
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.get(url);
    else if (equals(tmp$, Method$POST_getInstance().name))
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.post(url, data);
    else if (equals(tmp$, Method$PUT_getInstance().name))
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.put(url, data);
    else if (equals(tmp$, Method$PATCH_getInstance().name))
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.patch(url, data);
    else if (equals(tmp$, Method$DELETE_getInstance().name)) {
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.delete(url);
    }
     else if (equals(tmp$, Method$HEAD_getInstance().name)) {
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.head(url);
    }
     else if (equals(tmp$, Method$OPTIONS_getInstance().name)) {
      tmp$_0 = RefResolver_getInstance().axiosRefResolver.options(url);
    }
     else
      throw UnsupportedOperationException_init($receiver.method.toString());
    return tmp$_0;
  }
  function getLinkByRel($receiver, rel) {
    var $receiver_0 = $receiver.links;
    var firstOrNull$result;
    firstOrNull$break: do {
      var tmp$;
      tmp$ = $receiver_0.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        if (equals(element.rel, rel.toString())) {
          firstOrNull$result = element;
          break firstOrNull$break;
        }
      }
      firstOrNull$result = null;
    }
     while (false);
    return firstOrNull$result;
  }
  var ArrayList_init_0 = Kotlin.kotlin.collections.ArrayList_init_287e2$;
  function getTargetSchemaByRel($receiver, rel) {
    var $receiver_0 = $receiver.links;
    var destination = ArrayList_init_0();
    var tmp$;
    tmp$ = $receiver_0.iterator();
    while (tmp$.hasNext()) {
      var element = tmp$.next();
      if (equals(element.rel, rel.toString()))
        destination.add_11rb$(element);
    }
    var destination_0 = ArrayList_init(collectionSizeOrDefault(destination, 10));
    var tmp$_0;
    tmp$_0 = destination.iterator();
    while (tmp$_0.hasNext()) {
      var item = tmp$_0.next();
      destination_0.add_11rb$(item.targetSchema);
    }
    return firstOrNull(destination_0);
  }
  function getSchema$lambda(it) {
    return new Link_0(it.rel, it.href, it.method, it.targetSchema);
  }
  function getSchema($receiver) {
    var tmp$ = map(asSequence(iterator($receiver['_schema'].links)), getSchema$lambda);
    var tmp$_0;
    var accumulator = new Schema(ArrayList_init_0());
    tmp$_0 = tmp$.iterator();
    while (tmp$_0.hasNext()) {
      var element = tmp$_0.next();
      var s = accumulator;
      s.links.add_11rb$(element);
      accumulator = s;
    }
    return accumulator;
  }
  var REF_KEY;
  function defaultReplacer$lambda$lambda(closure$baseUrl, closure$pathToSchemaObject, closure$foundRef, closure$callback) {
    return function (schema) {
      localStorage[closure$baseUrl] = toJsonString(schema.data);
      resolveSchema(closure$pathToSchemaObject, toJson(schema.data), closure$foundRef, closure$callback);
      return Unit;
    };
  }
  function defaultReplacer$lambda(closure$callback) {
    return function (foundRef) {
      var url = foundRef[REF_KEY];
      if (startsWith(url, 'http')) {
        var baseUrl = first(splitToSequence(url, ['#']));
        console.log('found unresolved ref: ' + baseUrl);
        var pathToSchemaObject = schemaObjectPath(url);
        if (localStorage[baseUrl] == null) {
          $module$axios.get(url).then(defaultReplacer$lambda$lambda(baseUrl, pathToSchemaObject, foundRef, closure$callback));
        }
         else {
          console.log('response taken from cache');
          resolveSchema(pathToSchemaObject, JSON.parse(ensureNotNull(localStorage[baseUrl])), foundRef, closure$callback);
        }
      }
       else {
        closure$callback();
      }
      return Unit;
    };
  }
  function defaultReplacer(data, callback) {
    return replaceRef(data, callback, defaultReplacer$lambda(callback));
  }
  function replaceRef(any, callback, replacer) {
    if (contains(toJsonString(any), REF_KEY))
      return replaceRef_0(toJson(any), replacer);
    else {
      callback();
      return toJson(any);
    }
  }
  function replaceRef_0(body, replacer) {
    var tmp$, tmp$_0, tmp$_1;
    tmp$ = Object.getOwnPropertyNames(body);
    for (tmp$_0 = 0; tmp$_0 !== tmp$.length; ++tmp$_0) {
      var key = tmp$[tmp$_0];
      var child = (tmp$_1 = body[key]) != null ? tmp$_1 : json([]);
      if (equals(typeof child, 'object')) {
        body[key] = replaceRef_0(toJson(child), replacer);
      }
      if (equals(key, REF_KEY)) {
        replacer(body);
      }
    }
    return body;
  }
  function resolveSchema(pathToSchemaObject, schema, foundRef, callback) {
    console.log('trying to extract schema by path ' + pathToSchemaObject);
    var tmp$;
    var accumulator = schema;
    tmp$ = pathToSchemaObject.iterator();
    while (tmp$.hasNext()) {
      var element = tmp$.next();
      accumulator = toJson(accumulator[element]);
    }
    var json = accumulator;
    add(foundRef, json);
    foundRef[REF_KEY] = undefined;
    callback();
  }
  function schemaObjectPath$lambda(it) {
    return it.length > 0;
  }
  function schemaObjectPath(url) {
    return toList(filter(splitToSequence_0(substringAfterLast(url, 35), Kotlin.charArrayOf(47)), schemaObjectPath$lambda));
  }
  function CardRowProps() {
  }
  CardRowProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'CardRowProps',
    interfaces: []
  };
  function CardRow(props) {
    RComponent_init(props, this);
  }
  function CardRow$render$lambda$lambda(closure$it) {
    return function ($receiver) {
      card($receiver, closure$it);
      return Unit;
    };
  }
  CardRow.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = this.props.cards;
    var destination = ArrayList_init(collectionSizeOrDefault($receiver_0, 10));
    var tmp$;
    tmp$ = $receiver_0.iterator();
    while (tmp$.hasNext()) {
      var item = tmp$.next();
      destination.add_11rb$(new ColData(12, 3, 2, 'info-cards hoverable ' + item.offset, CardRow$render$lambda$lambda(item)));
    }
    var columns = destination;
    row($receiver, new RowData(columns));
  };
  CardRow.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CardRow',
    interfaces: [RComponent]
  };
  function cardRow$lambda(closure$cards) {
    return function ($receiver) {
      $receiver.attrs.cards = closure$cards;
      return Unit;
    };
  }
  function cardRow($receiver, cards) {
    return $receiver.child_bzgiuu$(getKClass(CardRow), cardRow$lambda(cards));
  }
  function LoginProps() {
  }
  LoginProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'LoginProps',
    interfaces: []
  };
  function LoginState() {
  }
  LoginState.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'LoginState',
    interfaces: []
  };
  function Login(props) {
    RComponent_init(props, this);
  }
  function Login$render$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      $receiver.username = toString(closure$it.target);
      return Unit;
    };
  }
  function Login$render$lambda$lambda(this$Login) {
    return function (it) {
      setState(this$Login, Login$render$lambda$lambda$lambda(it));
      return Unit;
    };
  }
  function Login$render$lambda$lambda$lambda_0(closure$it) {
    return function ($receiver) {
      $receiver.password = toString(closure$it.target);
      return Unit;
    };
  }
  function Login$render$lambda$lambda_0(this$Login) {
    return function (it) {
      setState(this$Login, Login$render$lambda$lambda$lambda_0(it));
      return Unit;
    };
  }
  function Login$render$lambda$lambda_1(this$Login) {
    return function (it) {
      console.log('User ' + this$Login.state.username + ' logged in.');
      return Unit;
    };
  }
  var attributesMapOf = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.attributesMapOf_alerag$;
  var A_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.A;
  function a$lambda(closure$href, closure$target, closure$classes) {
    return function (it) {
      return new A_init(attributesMapOf(['href', closure$href, 'target', closure$target, 'class', closure$classes]), it);
    };
  }
  var RDOMBuilder_init = $module$kotlin_react_dom.react.dom.RDOMBuilder;
  var attributesMapOf_0 = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.attributesMapOf_jyasbz$;
  var DIV_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.DIV;
  function div$lambda(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  Login.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda('login'));
    usernameInput($receiver_0, Login$render$lambda$lambda(this));
    passwordInput($receiver_0, Login$render$lambda$lambda_0(this));
    var $receiver_0_0 = new RDOMBuilder_init(a$lambda('/', null, 'login-links'));
    $receiver_0_0.unaryPlus_pdl1vz$(registration());
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(a$lambda('/', null, 'login-links'));
    $receiver_0_1.unaryPlus_pdl1vz$(forgotPassword());
    $receiver_0.child_2usv9w$($receiver_0_1.create());
    loginButton($receiver_0, Login$render$lambda$lambda_1(this));
    $receiver.child_2usv9w$($receiver_0.create());
  };
  Login.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Login',
    interfaces: [RComponent]
  };
  function login$lambda($receiver) {
    return Unit;
  }
  function login($receiver) {
    return $receiver.child_bzgiuu$(getKClass(Login), login$lambda);
  }
  function LoginButtonProps() {
  }
  LoginButtonProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'LoginButtonProps',
    interfaces: []
  };
  function LoginButton(props) {
    RComponent_init(props, this);
  }
  var P_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.P;
  function p$lambda(closure$classes) {
    return function (it) {
      return new P_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  LoginButton.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda(null));
    button($receiver_0, buttonLogin(), void 0, this.props.onClick);
    $receiver.child_2usv9w$($receiver_0.create());
  };
  LoginButton.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'LoginButton',
    interfaces: [RComponent]
  };
  function loginButton$lambda(closure$onClick) {
    return function ($receiver) {
      $receiver.attrs.onClick = closure$onClick;
      return Unit;
    };
  }
  function loginButton($receiver, onClick) {
    return $receiver.child_bzgiuu$(getKClass(LoginButton), loginButton$lambda(onClick));
  }
  function PasswordProps() {
  }
  PasswordProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'PasswordProps',
    interfaces: []
  };
  function PasswordInput(props) {
    RComponent_init(props, this);
  }
  PasswordInput.prototype.render_ss14n$ = function ($receiver) {
    input($receiver, new InputData(placeholderPassword(), void 0, 'password', this.props.onPasswordChanged, 'lock_outline'));
  };
  PasswordInput.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'PasswordInput',
    interfaces: [RComponent]
  };
  function passwordInput$lambda(closure$onPasswordChanged) {
    return function ($receiver) {
      $receiver.attrs.onPasswordChanged = closure$onPasswordChanged;
      return Unit;
    };
  }
  function passwordInput($receiver, onPasswordChanged) {
    return $receiver.child_bzgiuu$(getKClass(PasswordInput), passwordInput$lambda(onPasswordChanged));
  }
  function UsernameProps() {
  }
  UsernameProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'UsernameProps',
    interfaces: []
  };
  function UsernameInput(props) {
    RComponent_init(props, this);
  }
  UsernameInput.prototype.render_ss14n$ = function ($receiver) {
    input($receiver, new InputData(placeholderUsername(), void 0, void 0, this.props.onUsernameChanged, 'account_circle'));
  };
  UsernameInput.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'UsernameInput',
    interfaces: [RComponent]
  };
  function usernameInput$lambda(closure$onUsernameChanged) {
    return function ($receiver) {
      $receiver.attrs.onUsernameChanged = closure$onUsernameChanged;
      return Unit;
    };
  }
  function usernameInput($receiver, onUsernameChanged) {
    return $receiver.child_bzgiuu$(getKClass(UsernameInput), usernameInput$lambda(onUsernameChanged));
  }
  var IMG_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.IMG;
  function img$lambda(closure$alt, closure$src, closure$classes) {
    return function (it) {
      return new IMG_init(attributesMapOf(['alt', closure$alt, 'src', closure$src, 'class', closure$classes]), it);
    };
  }
  function div$lambda_0(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function logo($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_0('Logo'));
    var $receiver_0_0 = new RDOMBuilder_init(img$lambda('h-logo', '/images/letter_H_curvy.svg', 'Logo-h'));
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
  }
  function QuestionCardProps() {
  }
  QuestionCardProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'QuestionCardProps',
    interfaces: []
  };
  function CurrentResponseProps() {
  }
  CurrentResponseProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'CurrentResponseProps',
    interfaces: []
  };
  function NextRequestProps() {
  }
  NextRequestProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'NextRequestProps',
    interfaces: []
  };
  function QuestionCard() {
    RComponent_init_0(this);
  }
  function QuestionCard$iconButton$lambda$ObjectLiteral(closure$onClick) {
    this.className = 'waves-effect waves-teal material-icons';
    this.onClick = closure$onClick;
  }
  QuestionCard$iconButton$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function QuestionCard$iconButton$lambda$lambda(closure$iconText) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$(closure$iconText);
      return Unit;
    };
  }
  QuestionCard.prototype.iconButton_0 = function ($receiver, iconText, onClick) {
    return $receiver.child_4dvv5y$('i', new QuestionCard$iconButton$lambda$ObjectLiteral(onClick), QuestionCard$iconButton$lambda$lambda(iconText));
  };
  QuestionCard.prototype.whenContentReady_0 = function ($receiver, andThen) {
    var tmp$ = this.props.body === undefined;
    if (!tmp$) {
      tmp$ = Object.getOwnPropertyNames(this.props.body).length === 0;
    }
    if (tmp$ || this.props.schema === undefined)
      this.showLoadingDots_0($receiver);
    else
      andThen();
  };
  var SPAN_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.SPAN;
  function span$lambda(closure$classes) {
    return function (it) {
      return new SPAN_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  QuestionCard.prototype.showLoadingDots_0 = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(span$lambda('loading-dots'));
    $receiver_0.unaryPlus_pdl1vz$('.');
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_0 = new RDOMBuilder_init(span$lambda('loading-dots'));
    $receiver_0_0.unaryPlus_pdl1vz$('.');
    $receiver.child_2usv9w$($receiver_0_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(span$lambda('loading-dots'));
    $receiver_0_1.unaryPlus_pdl1vz$('.');
    return $receiver.child_2usv9w$($receiver_0_1.create());
  };
  function QuestionCard$render$lambda$lambda$lambda$lambda(it) {
    console.log('clicked left');
    return Unit;
  }
  function QuestionCard$render$lambda$lambda$lambda(this$QuestionCard) {
    return function ($receiver) {
      this$QuestionCard.iconButton_0($receiver, 'chevron_left', QuestionCard$render$lambda$lambda$lambda$lambda);
      return Unit;
    };
  }
  function QuestionCard$render$lambda$lambda$lambda$lambda_0(this$QuestionCard, this$) {
    return function () {
      var targetSchema = getTargetSchemaByRel(this$QuestionCard.props.schema, Relation$NEXT_getInstance());
      currentResponse(this$, this$QuestionCard.props.body, targetSchema == null);
      if (targetSchema != null)
        nextRequest(this$, this$QuestionCard.props.body, targetSchema, this$QuestionCard.props.onSubmit);
      return Unit;
    };
  }
  function QuestionCard$render$lambda$lambda$lambda_0(this$QuestionCard) {
    return function ($receiver) {
      this$QuestionCard.whenContentReady_0($receiver, QuestionCard$render$lambda$lambda$lambda$lambda_0(this$QuestionCard, $receiver));
      return Unit;
    };
  }
  function QuestionCard$render$lambda$lambda$lambda$lambda_1(it) {
    console.log('clicked right');
    return Unit;
  }
  function QuestionCard$render$lambda$lambda$lambda_1(this$QuestionCard) {
    return function ($receiver) {
      this$QuestionCard.iconButton_0($receiver, 'chevron_right', QuestionCard$render$lambda$lambda$lambda$lambda_1);
      return Unit;
    };
  }
  function QuestionCard$render$lambda$lambda(this$QuestionCard) {
    return function ($receiver) {
      row($receiver, new RowData(listOf([new ColData(1, void 0, void 0, 'question-card-to-left', QuestionCard$render$lambda$lambda$lambda(this$QuestionCard)), new ColData(10, void 0, void 0, 'question-card-body', QuestionCard$render$lambda$lambda$lambda_0(this$QuestionCard)), new ColData(1, void 0, void 0, 'question-card-to-right', QuestionCard$render$lambda$lambda$lambda_1(this$QuestionCard))]), 'valign-wrapper'));
      return Unit;
    };
  }
  function div$lambda_1(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  QuestionCard.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_1('questionnaire valign-wrapper'));
    card($receiver_0, new CardData('', void 0, 'offset-m2 offset-l3', void 0, void 0, QuestionCard$render$lambda$lambda(this)));
    $receiver.child_2usv9w$($receiver_0.create());
  };
  QuestionCard.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'QuestionCard',
    interfaces: [RComponent]
  };
  function CurrentResponse() {
    RComponent_init_0(this);
  }
  function p$lambda_0(closure$classes) {
    return function (it) {
      return new P_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  CurrentResponse.prototype.displayBody_0 = function ($receiver) {
    var $receiver_0 = Object.getOwnPropertyNames(this.props.body);
    var destination = ArrayList_init_0();
    var tmp$;
    for (tmp$ = 0; tmp$ !== $receiver_0.length; ++tmp$) {
      var element = $receiver_0[tmp$];
      if (!equals(element, '_schema'))
        destination.add_11rb$(element);
    }
    var destination_0 = ArrayList_init(collectionSizeOrDefault(destination, 10));
    var tmp$_0;
    tmp$_0 = destination.iterator();
    while (tmp$_0.hasNext()) {
      var item = tmp$_0.next();
      var tmp$_1 = destination_0.add_11rb$;
      var $receiver_0_0 = new RDOMBuilder_init(p$lambda_0(null));
      $receiver_0_0.unaryPlus_pdl1vz$(item + ': ' + toString(this.props.body[item]));
      tmp$_1.call(destination_0, $receiver.child_2usv9w$($receiver_0_0.create()));
    }
  };
  CurrentResponse.prototype.displayFinalValue_0 = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_1('question-card-final-result-value'));
    icon($receiver_0, new IconData(void 0, void 0, void 0, void 0, void 0, void 0, void 0, true), 'home');
    var $receiver_1 = Object.getOwnPropertyNames(this.props.body);
    var destination = ArrayList_init_0();
    var tmp$;
    for (tmp$ = 0; tmp$ !== $receiver_1.length; ++tmp$) {
      var element = $receiver_1[tmp$];
      if (equals(element, 'gesamtwert'))
        destination.add_11rb$(element);
    }
    var destination_0 = ArrayList_init(collectionSizeOrDefault(destination, 10));
    var tmp$_0;
    tmp$_0 = destination.iterator();
    while (tmp$_0.hasNext()) {
      var item = tmp$_0.next();
      var tmp$_1 = destination_0.add_11rb$;
      var $receiver_0_0 = new RDOMBuilder_init(p$lambda_0(null));
      $receiver_0_0.unaryPlus_pdl1vz$(toString(this.props.body[item]) + ' \u20AC');
      tmp$_1.call(destination_0, $receiver_0.child_2usv9w$($receiver_0_0.create()));
    }
    $receiver.child_2usv9w$($receiver_0.create());
  };
  function CurrentResponse$displayFinalFooter$lambda$lambda$lambda(it) {
    return Unit;
  }
  function CurrentResponse$displayFinalFooter$lambda$lambda($receiver) {
    button($receiver, newQuestionnaire(), void 0, CurrentResponse$displayFinalFooter$lambda$lambda$lambda);
    return Unit;
  }
  function CurrentResponse$displayFinalFooter$lambda$lambda$lambda_0(it) {
    return Unit;
  }
  function CurrentResponse$displayFinalFooter$lambda$lambda_0($receiver) {
    button($receiver, backToHome(), void 0, CurrentResponse$displayFinalFooter$lambda$lambda$lambda_0);
    return Unit;
  }
  CurrentResponse.prototype.displayFinalFooter_0 = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_1('question-card-final-result-footer'));
    link($receiver_0, '/questionnaire', CurrentResponse$displayFinalFooter$lambda$lambda);
    link($receiver_0, '/', CurrentResponse$displayFinalFooter$lambda$lambda_0);
    $receiver.child_2usv9w$($receiver_0.create());
  };
  var H3_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.H3;
  function h3$lambda(closure$classes) {
    return function (it) {
      return new H3_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  var H1_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.H1;
  function h1$lambda(closure$classes) {
    return function (it) {
      return new H1_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  CurrentResponse.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_1('question-card-current-response'));
    if (!this.props.finalResponse) {
      var $receiver_0_0 = new RDOMBuilder_init(h3$lambda(null));
      $receiver_0_0.unaryPlus_pdl1vz$(currentResultHeader());
      $receiver_0.child_2usv9w$($receiver_0_0.create());
      this.displayBody_0($receiver_0);
    }
     else {
      var $receiver_0_1 = new RDOMBuilder_init(h1$lambda(null));
      $receiver_0_1.unaryPlus_pdl1vz$(endResultHeader());
      $receiver_0.child_2usv9w$($receiver_0_1.create());
      this.displayFinalValue_0($receiver_0);
      this.displayFinalFooter_0($receiver_0);
    }
    $receiver.child_2usv9w$($receiver_0.create());
  };
  CurrentResponse.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CurrentResponse',
    interfaces: [RComponent]
  };
  function NextRequest() {
    RComponent_init_0(this);
  }
  function NextRequest$render$lambda$lambda(it) {
    console.log(it);
    return it;
  }
  NextRequest.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_1('question-card-next-request'));
    var tmp$;
    var $receiver_0_0 = new RDOMBuilder_init(h3$lambda(null));
    $receiver_0_0.unaryPlus_pdl1vz$(nextRequestHeader());
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    tmp$ = this.props.onSubmit;
    form($receiver_0, new FormData(this.props.targetSchema, void 0, void 0, tmp$, void 0, void 0, NextRequest$render$lambda$lambda));
    $receiver.child_2usv9w$($receiver_0.create());
  };
  NextRequest.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'NextRequest',
    interfaces: [RComponent]
  };
  function questionCard$lambda$lambda(closure$body, closure$schema, closure$onSubmit) {
    return function ($receiver) {
      $receiver.body = closure$body;
      $receiver.schema = closure$schema;
      $receiver.onSubmit = closure$onSubmit;
      return Unit;
    };
  }
  function questionCard$lambda(closure$body, closure$schema, closure$onSubmit, closure$block) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(questionCard$lambda$lambda(closure$body, closure$schema, closure$onSubmit));
      closure$block($receiver);
      return Unit;
    };
  }
  function questionCard($receiver, body, schema, onSubmit, block) {
    return $receiver.child_bzgiuu$(getKClass(QuestionCard), questionCard$lambda(body, schema, onSubmit, block));
  }
  function currentResponse$lambda$lambda(closure$body, closure$finalResponse) {
    return function ($receiver) {
      $receiver.body = closure$body;
      $receiver.finalResponse = closure$finalResponse;
      return Unit;
    };
  }
  function currentResponse$lambda(closure$body, closure$finalResponse) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(currentResponse$lambda$lambda(closure$body, closure$finalResponse));
      return Unit;
    };
  }
  function currentResponse($receiver, body, finalResponse) {
    return $receiver.child_bzgiuu$(getKClass(CurrentResponse), currentResponse$lambda(body, finalResponse));
  }
  function nextRequest$lambda$lambda(closure$body, closure$targetSchema, closure$onSubmit) {
    return function ($receiver) {
      $receiver.body = closure$body;
      $receiver.targetSchema = closure$targetSchema;
      $receiver.onSubmit = closure$onSubmit;
      return Unit;
    };
  }
  function nextRequest$lambda(closure$body, closure$targetSchema, closure$onSubmit) {
    return function ($receiver) {
      $receiver.attrs_slhiwc$(nextRequest$lambda$lambda(closure$body, closure$targetSchema, closure$onSubmit));
      return Unit;
    };
  }
  function nextRequest($receiver, body, targetSchema, onSubmit) {
    return $receiver.child_bzgiuu$(getKClass(NextRequest), nextRequest$lambda(body, targetSchema, onSubmit));
  }
  function QuestionnaireState() {
  }
  QuestionnaireState.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'QuestionnaireState',
    interfaces: []
  };
  function Questionnaire() {
    RComponent_init_0(this);
  }
  function Questionnaire$componentWillMount$lambda$lambda(closure$newId) {
    return function ($receiver) {
      $receiver.qid = closure$newId;
      return Unit;
    };
  }
  function Questionnaire$componentWillMount$lambda(this$Questionnaire) {
    return function (response) {
      var newId = toString(toJson(response.data)['id']);
      console.log('created new questionnaire with id ' + newId);
      setState(this$Questionnaire, Questionnaire$componentWillMount$lambda$lambda(newId));
      questionRepo.getById_up196s$(newId, getCallableRef('onResponse', function ($receiver, response) {
        return $receiver.onResponse_0(response), Unit;
      }.bind(null, this$Questionnaire)));
      return Unit;
    };
  }
  Questionnaire.prototype.componentWillMount = function () {
    var qid = this.state.qid;
    if (qid !== undefined) {
      console.log('requesting questionnaire with id ' + qid);
      questionRepo.getById_up196s$(qid, getCallableRef('onResponse', function ($receiver, response) {
        return $receiver.onResponse_0(response), Unit;
      }.bind(null, this)));
    }
     else
      questionRepo.create_7qpfje$(Questionnaire$componentWillMount$lambda(this));
  };
  function Questionnaire$onResponse$lambda(closure$response, this$Questionnaire) {
    return function ($receiver) {
      $receiver.body = toJson(closure$response.data);
      $receiver.schema = getSchema($receiver.body);
      $receiver.onSubmit = this$Questionnaire.prepareSubmission_0($receiver.schema);
      return Unit;
    };
  }
  Questionnaire.prototype.onResponse_0 = function (response) {
    setState(this, Questionnaire$onResponse$lambda(response, this));
  };
  function Questionnaire$prepareSubmission$lambda$lambda($receiver) {
    $receiver.body = json([]);
    return Unit;
  }
  function Questionnaire$prepareSubmission$lambda(this$Questionnaire, closure$schema) {
    return function (submit) {
      var tmp$;
      setState(this$Questionnaire, Questionnaire$prepareSubmission$lambda$lambda);
      var formData = toJson(Kotlin.isType(tmp$ = submit.formData, Any) ? tmp$ : throwCCE());
      questionRepo.getNext_uk481n$(closure$schema, formData, getCallableRef('onResponse', function ($receiver, response) {
        return $receiver.onResponse_0(response), Unit;
      }.bind(null, this$Questionnaire)));
      return Unit;
    };
  }
  Questionnaire.prototype.prepareSubmission_0 = function (schema) {
    return Questionnaire$prepareSubmission$lambda(this, schema);
  };
  function Questionnaire$render$lambda($receiver) {
    return Unit;
  }
  Questionnaire.prototype.render_ss14n$ = function ($receiver) {
    questionCard($receiver, this.state.body, this.state.schema, this.state.onSubmit, Questionnaire$render$lambda);
  };
  Questionnaire.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Questionnaire',
    interfaces: [RComponent]
  };
  function About() {
    RComponent_init_0(this);
  }
  var BR_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.BR;
  function br$lambda(closure$classes) {
    return function (it) {
      return new BR_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function h3$lambda_0(closure$classes) {
    return function (it) {
      return new H3_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function p$lambda_1(closure$classes) {
    return function (it) {
      return new P_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function span$lambda_0(closure$classes) {
    return function (it) {
      return new SPAN_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function a$lambda_0(closure$href, closure$target, closure$classes) {
    return function (it) {
      return new A_init(attributesMapOf(['href', closure$href, 'target', closure$target, 'class', closure$classes]), it);
    };
  }
  var H2_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.H2;
  function h2$lambda(closure$classes) {
    return function (it) {
      return new H2_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function div$lambda_2(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function About$render$ObjectLiteral() {
    this.href = '#';
  }
  About$render$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  var H5_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.H5;
  function h5$lambda(closure$classes) {
    return function (it) {
      return new H5_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function About$render$lambda($receiver) {
    var $receiver_0 = new RDOMBuilder_init(h5$lambda(null));
    $receiver_0.unaryPlus_pdl1vz$(footerHeader());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_0 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_0.unaryPlus_pdl1vz$(footerContent());
    $receiver.child_2usv9w$($receiver_0_0.create());
    return Unit;
  }
  About.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_2('about-wrapper'));
    var $receiver_0_0 = new RDOMBuilder_init(h2$lambda(null));
    $receiver_0_0.unaryPlus_pdl1vz$('Datenschutzerkl\xE4rung');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0.child_2usv9w$($receiver_0_1.create());
    var $receiver_0_2 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_3 = new RDOMBuilder_init(h3$lambda_0('dsg-general-intro'));
    $receiver_0_2.child_2usv9w$($receiver_0_3.create());
    var $receiver_0_4 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_4.unaryPlus_pdl1vz$('Diese Datenschutzerkl\xE4rung kl\xE4rt Sie \xFCber die Art, den Umfang und Zweck der Verarbeitung von personenbezogenen Daten (nachfolgend kurz \u201EDaten\u201C) innerhalb unseres Onlineangebotes und der mit ihm verbundenen Webseiten, Funktionen und Inhalte sowie externen Onlinepr\xE4senzen, wie z.B. unser Social Media Profile auf (nachfolgend gemeinsam bezeichnet als \u201EOnlineangebot\u201C). Im Hinblick auf die verwendeten Begrifflichkeiten, wie z.B. \u201EVerarbeitung\u201C oder \u201EVerantwortlicher\u201C verweisen wir auf die Definitionen im Art. 4 der Datenschutzgrundverordnung (DSGVO).');
    var $receiver_0_5 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_4.child_2usv9w$($receiver_0_5.create());
    $receiver_0_2.child_2usv9w$($receiver_0_4.create());
    $receiver_0.child_2usv9w$($receiver_0_2.create());
    var $receiver_0_6 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_7 = new RDOMBuilder_init(h3$lambda_0('dsg-general-controller'));
    $receiver_0_7.unaryPlus_pdl1vz$('Verantwortlicher');
    $receiver_0_6.child_2usv9w$($receiver_0_7.create());
    var $receiver_0_8 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_9 = new RDOMBuilder_init(span$lambda_0('tsmcontroller'));
    $receiver_0_9.unaryPlus_pdl1vz$('Alexander Girke');
    var $receiver_0_10 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_9.child_2usv9w$($receiver_0_10.create());
    $receiver_0_9.unaryPlus_pdl1vz$('Untere Eichst\xE4dtstra\xDFe 7');
    var $receiver_0_11 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_9.child_2usv9w$($receiver_0_11.create());
    $receiver_0_9.unaryPlus_pdl1vz$('04299 Leipzig');
    var $receiver_0_12 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_9.child_2usv9w$($receiver_0_12.create());
    $receiver_0_9.unaryPlus_pdl1vz$('Deutschland');
    var $receiver_0_13 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_9.child_2usv9w$($receiver_0_13.create());
    var $receiver_0_14 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_9.child_2usv9w$($receiver_0_14.create());
    $receiver_0_9.unaryPlus_pdl1vz$('E-Mailadresse: alexgirke@web.de');
    $receiver_0_8.child_2usv9w$($receiver_0_9.create());
    $receiver_0_6.child_2usv9w$($receiver_0_8.create());
    $receiver_0.child_2usv9w$($receiver_0_6.create());
    var $receiver_0_15 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_16 = new RDOMBuilder_init(h3$lambda_0('dsg-general-datatype'));
    $receiver_0_16.unaryPlus_pdl1vz$('Arten der verarbeiteten Daten:');
    $receiver_0_15.child_2usv9w$($receiver_0_16.create());
    var $receiver_0_17 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_17.unaryPlus_pdl1vz$('- Bestandsdaten(z.B., Namen, Adressen).');
    var $receiver_0_18 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_17.child_2usv9w$($receiver_0_18.create());
    $receiver_0_17.unaryPlus_pdl1vz$('- Kontaktdaten(z.B., E - Mail, Telefonnummern).');
    var $receiver_0_19 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_17.child_2usv9w$($receiver_0_19.create());
    $receiver_0_17.unaryPlus_pdl1vz$('- Inhaltsdaten(z.B., Texteingaben, Fotografien, Videos).');
    var $receiver_0_20 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_17.child_2usv9w$($receiver_0_20.create());
    $receiver_0_17.unaryPlus_pdl1vz$('- Nutzungsdaten(z.B., besuchte Webseiten, Interesse an Inhalten, Zugriffszeiten).');
    var $receiver_0_21 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_17.child_2usv9w$($receiver_0_21.create());
    $receiver_0_17.unaryPlus_pdl1vz$('- Meta - / Kommunikationsdaten (z.B., Ger\xE4te-Informationen, IP-Adressen).');
    var $receiver_0_22 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_17.child_2usv9w$($receiver_0_22.create());
    $receiver_0_15.child_2usv9w$($receiver_0_17.create());
    $receiver_0.child_2usv9w$($receiver_0_15.create());
    var $receiver_0_23 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_24 = new RDOMBuilder_init(h3$lambda_0('dsg-general-datasubjects'));
    $receiver_0_24.unaryPlus_pdl1vz$('Kategorien betroffener Personen');
    $receiver_0_23.child_2usv9w$($receiver_0_24.create());
    var $receiver_0_25 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_25.unaryPlus_pdl1vz$('Besucher und Nutzer des Onlineangebotes(Nachfolgend bezeichnen wir die betroffenen Personen zusammenfassend auch als \u201E Nutzer \u201C).');
    var $receiver_0_26 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_25.child_2usv9w$($receiver_0_26.create());
    $receiver_0_23.child_2usv9w$($receiver_0_25.create());
    $receiver_0.child_2usv9w$($receiver_0_23.create());
    var $receiver_0_27 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_28 = new RDOMBuilder_init(h3$lambda_0('dsg-general-purpose'));
    $receiver_0_28.unaryPlus_pdl1vz$('Zweck der Verarbeitung');
    $receiver_0_27.child_2usv9w$($receiver_0_28.create());
    var $receiver_0_29 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_29.unaryPlus_pdl1vz$('- Zurverf\xFCgungstellung des Onlineangebotes, seiner Funktionen und  Inhalte.');
    var $receiver_0_30 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_29.child_2usv9w$($receiver_0_30.create());
    $receiver_0_29.unaryPlus_pdl1vz$('- Beantwortung von Kontaktanfragen und Kommunikation mit Nutzern.');
    var $receiver_0_31 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_29.child_2usv9w$($receiver_0_31.create());
    $receiver_0_29.unaryPlus_pdl1vz$('- Sicherheitsma\xDFnahmen.');
    var $receiver_0_32 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_29.child_2usv9w$($receiver_0_32.create());
    $receiver_0_29.unaryPlus_pdl1vz$('- Reichweitenmessung / Marketing');
    var $receiver_0_33 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_29.child_2usv9w$($receiver_0_33.create());
    var $receiver_0_34 = new RDOMBuilder_init(span$lambda_0('tsmcom'));
    $receiver_0_29.child_2usv9w$($receiver_0_34.create());
    $receiver_0_27.child_2usv9w$($receiver_0_29.create());
    $receiver_0.child_2usv9w$($receiver_0_27.create());
    var $receiver_0_35 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_36 = new RDOMBuilder_init(h3$lambda_0('dsg-general-terms'));
    $receiver_0_36.unaryPlus_pdl1vz$('Verwendete Begrifflichkeiten');
    $receiver_0_35.child_2usv9w$($receiver_0_36.create());
    var $receiver_0_37 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_37.unaryPlus_pdl1vz$('\u201EPersonenbezogene Daten \u201C sind alle Informationen, die sich auf eine identifizierte oder identifizierbare nat\xFCrliche Person (im Folgenden \u201Ebetroffene Person\u201C) beziehen; als identifizierbar wird eine nat\xFCrliche Person angesehen, die direkt oder indirekt, insbesondere mittels Zuordnung zu einer Kennung wie einem Namen, zu einer Kennnummer, zu Standortdaten, zu einer Online-Kennung (z.B. Cookie) oder zu einem oder mehreren besonderen Merkmalen identifiziert werden kann, die Ausdruck der physischen, physiologischen, genetischen, psychischen, wirtschaftlichen, kulturellen oder sozialen Identit\xE4t dieser nat\xFCrlichen Person sind.');
    var $receiver_0_38 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_38.create());
    $receiver_0_37.unaryPlus_pdl1vz$('\u201EVerarbeitung\u201C ist jeder mit oder ohne Hilfe automatisierter Verfahren ausgef\xFChrte Vorgang oder jede solche Vorgangsreihe im Zusammenhang mit personenbezogenen Daten. Der Begriff reicht weit und umfasst praktisch jeden Umgang mit Daten.');
    var $receiver_0_39 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_39.create());
    $receiver_0_37.unaryPlus_pdl1vz$('\u201EPseudonymisierung\u201C die Verarbeitung personenbezogener Daten in einer Weise, dass die personenbezogenen Daten ohne Hinzuziehung zus\xE4tzlicher Informationen nicht mehr einer spezifischen betroffenen Person zugeordnet werden k\xF6nnen, sofern diese zus\xE4tzlichen Informationen gesondert aufbewahrt werden und technischen und organisatorischen Ma\xDFnahmen unterliegen, die gew\xE4hrleisten, dass die personenbezogenen Daten nicht einer identifizierten oder identifizierbaren nat\xFCrlichen Person zugewiesen werden.');
    var $receiver_0_40 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_40.create());
    $receiver_0_37.unaryPlus_pdl1vz$('\u201EProfiling\u201C jede Art der automatisierten Verarbeitung personenbezogener Daten, die darin besteht, dass diese personenbezogenen Daten verwendet werden, um bestimmte pers\xF6nliche Aspekte, die sich auf eine nat\xFCrliche Person beziehen, zu bewerten, insbesondere um Aspekte bez\xFCglich Arbeitsleistung, wirtschaftliche Lage, Gesundheit, pers\xF6nliche Vorlieben, Interessen, Zuverl\xE4ssigkeit, Verhalten, Aufenthaltsort oder Ortswechsel dieser nat\xFCrlichen Person zu analysieren oder vorherzusagen.');
    var $receiver_0_41 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_41.create());
    $receiver_0_37.unaryPlus_pdl1vz$('Als \u201EVerantwortlicher\u201C wird die nat\xFCrliche oder juristische Person, Beh\xF6rde, Einrichtung oder andere Stelle, die allein oder gemeinsam mit anderen \xFCber die Zwecke und Mittel der Verarbeitung von personenbezogenen Daten entscheidet, bezeichnet.');
    var $receiver_0_42 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_42.create());
    $receiver_0_37.unaryPlus_pdl1vz$('\u201EAuftragsverarbeiter\u201C eine nat\xFCrliche oder juristische Person, Beh\xF6rde, Einrichtung oder andere Stelle, die personenbezogene Daten im Auftrag des Verantwortlichen verarbeitet.');
    var $receiver_0_43 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_37.child_2usv9w$($receiver_0_43.create());
    $receiver_0_35.child_2usv9w$($receiver_0_37.create());
    $receiver_0.child_2usv9w$($receiver_0_35.create());
    var $receiver_0_44 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_45 = new RDOMBuilder_init(h3$lambda_0('dsg-general-legalbasis'));
    $receiver_0_45.unaryPlus_pdl1vz$('Ma\xDFgebliche Rechtsgrundlagen');
    $receiver_0_44.child_2usv9w$($receiver_0_45.create());
    var $receiver_0_46 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_46.unaryPlus_pdl1vz$('Nach Ma\xDFgabe des Art . 13 DSGVO teilen wir Ihnen die Rechtsgrundlagen unserer Datenverarbeitungen mit. Sofern die Rechtsgrundlage in der Datenschutzerkl\xE4rung nicht genannt wird, gilt Folgendes: Die Rechtsgrundlage f\xFCr die Einholung von Einwilligungen ist Art. 6 Abs. 1 lit. a und Art. 7 DSGVO, die Rechtsgrundlage f\xFCr die Verarbeitung zur Erf\xFCllung unserer Leistungen und Durchf\xFChrung vertraglicher Ma\xDFnahmen sowie Beantwortung von Anfragen ist Art. 6 Abs. 1 lit. b DSGVO, die Rechtsgrundlage f\xFCr die Verarbeitung zur Erf\xFCllung unserer rechtlichen Verpflichtungen ist Art. 6 Abs. 1 lit. c DSGVO, und die Rechtsgrundlage f\xFCr die Verarbeitung zur Wahrung unserer berechtigten Interessen ist Art. 6 Abs. 1 lit. f DSGVO. F\xFCr den Fall, dass lebenswichtige Interessen der betroffenen Person oder einer anderen nat\xFCrlichen Person eine Verarbeitung personenbezogener Daten erforderlich machen, dient Art. 6 Abs. 1 lit. d DSGVO als Rechtsgrundlage.');
    $receiver_0_44.child_2usv9w$($receiver_0_46.create());
    $receiver_0.child_2usv9w$($receiver_0_44.create());
    var $receiver_0_47 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_48 = new RDOMBuilder_init(h3$lambda_0('dsg-general-securitymeasures'));
    $receiver_0_48.unaryPlus_pdl1vz$('Sicherheitsma\xDFnahmen');
    $receiver_0_47.child_2usv9w$($receiver_0_48.create());
    var $receiver_0_49 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_49.unaryPlus_pdl1vz$('Wir treffen nach Ma\xDFgabe des Art . 32 DSGVO unter Ber\xFCcksichtigung des Stands der Technik, der Implementierungskosten und der Art, des Umfangs, der Umst\xE4nde und der Zwecke der Verarbeitung sowie der unterschiedlichen Eintrittswahrscheinlichkeit und Schwere des Risikos f\xFCr die Rechte und Freiheiten nat\xFCrlicher Personen, geeignete technische und organisatorische Ma\xDFnahmen, um ein dem Risiko angemessenes Schutzniveau zu gew\xE4hrleisten.');
    var $receiver_0_50 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_49.child_2usv9w$($receiver_0_50.create());
    $receiver_0_49.unaryPlus_pdl1vz$('Zu den Ma\xDFnahmen geh\xF6ren insbesondere die Sicherung der Vertraulichkeit, Integrit\xE4t und Verf\xFCgbarkeit von Daten durch Kontrolle des physischen Zugangs zu den Daten, als auch des sie betreffenden Zugriffs, der Eingabe, Weitergabe, der Sicherung der Verf\xFCgbarkeit und ihrer Trennung. Des Weiteren haben wir Verfahren eingerichtet, die eine Wahrnehmung von Betroffenenrechten, L\xF6schung von Daten und Reaktion auf Gef\xE4hrdung der Daten gew\xE4hrleisten. Ferner ber\xFCcksichtigen wir den Schutz personenbezogener Daten bereits bei der Entwicklung, bzw. Auswahl von Hardware, Software sowie Verfahren, entsprechend dem Prinzip des Datenschutzes durch Technikgestaltung und durch datenschutzfreundliche Voreinstellungen (Art. 25 DSGVO).');
    var $receiver_0_51 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_49.child_2usv9w$($receiver_0_51.create());
    $receiver_0_47.child_2usv9w$($receiver_0_49.create());
    $receiver_0.child_2usv9w$($receiver_0_47.create());
    var $receiver_0_52 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_53 = new RDOMBuilder_init(h3$lambda_0('dsg-general-coprocessing'));
    $receiver_0_53.unaryPlus_pdl1vz$('Zusammenarbeit mit Auftragsverarbeitern und Dritten');
    $receiver_0_52.child_2usv9w$($receiver_0_53.create());
    var $receiver_0_54 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_54.unaryPlus_pdl1vz$('Sofern wir im Rahmen unserer Verarbeitung Daten gegen\xFCber anderen Personen und Unternehmen (Auftragsverarbeitern oder Dritten) offenbaren, sie an diese \xFCbermitteln oder ihnen sonst Zugriff auf die Daten gew\xE4hren, erfolgt dies nur auf Grundlage einer gesetzlichen Erlaubnis (z.B. wenn eine \xDCbermittlung der Daten an Dritte, wie an Zahlungsdienstleister, gem. Art. 6 Abs. 1 lit. b DSGVO zur Vertragserf\xFCllung erforderlich ist), Sie eingewilligt haben, eine rechtliche Verpflichtung dies vorsieht oder auf Grundlage unserer berechtigten Interessen (z.B. beim Einsatz von Beauftragten, Webhostern, etc.).');
    var $receiver_0_55 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_54.child_2usv9w$($receiver_0_55.create());
    $receiver_0_54.unaryPlus_pdl1vz$('Sofern wir Dritte mit der Verarbeitung von Daten auf Grundlage eines sog . \u201EAuftragsverarbeitungsvertrages\u201C beauftragen, geschieht dies auf Grundlage des Art. 28 DSGVO.');
    $receiver_0_52.child_2usv9w$($receiver_0_54.create());
    $receiver_0.child_2usv9w$($receiver_0_52.create());
    var $receiver_0_56 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_57 = new RDOMBuilder_init(h3$lambda_0('dsg-general-thirdparty'));
    $receiver_0_57.unaryPlus_pdl1vz$('\xDCbermittlungen in Drittl\xE4nder');
    $receiver_0_56.child_2usv9w$($receiver_0_57.create());
    var $receiver_0_58 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_58.unaryPlus_pdl1vz$('Sofern wir Daten in einem Drittland (d.h.au\xDFerhalb der Europ\xE4ischen Union (EU) oder des Europ\xE4ischen Wirtschaftsraums(EWR)) verarbeiten oder dies im Rahmen der Inanspruchnahme von Diensten Dritter oder Offenlegung, bzw. \xDCbermittlung von Daten an Dritte geschieht, erfolgt dies nur, wenn es zur Erf\xFCllung unserer (vor)vertraglichen Pflichten, auf Grundlage Ihrer Einwilligung, aufgrund einer rechtlichen Verpflichtung oder auf Grundlage unserer berechtigten Interessen geschieht. Vorbehaltlich gesetzlicher oder vertraglicher Erlaubnisse, verarbeiten oder lassen wir die Daten in einem Drittland nur beim Vorliegen der besonderen Voraussetzungen der Art. 44 ff. DSGVO verarbeiten. D.h. die Verarbeitung erfolgt z.B. auf Grundlage besonderer Garantien, wie der offiziell anerkannten Feststellung eines der EU entsprechenden Datenschutzniveaus (z.B. f\xFCr die USA durch das \u201EPrivacy Shield\u201C) oder Beachtung offiziell anerkannter spezieller vertraglicher Verpflichtungen (so genannte \u201EStandardvertragsklauseln\u201C).');
    $receiver_0_56.child_2usv9w$($receiver_0_58.create());
    $receiver_0.child_2usv9w$($receiver_0_56.create());
    var $receiver_0_59 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_60 = new RDOMBuilder_init(h3$lambda_0('dsg-general-rightssubject'));
    $receiver_0_60.unaryPlus_pdl1vz$('Rechte der betroffenen Personen');
    $receiver_0_59.child_2usv9w$($receiver_0_60.create());
    var $receiver_0_61 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_61.unaryPlus_pdl1vz$('Sie haben das Recht, eine Best\xE4tigung dar\xFCber zu verlangen, ob betreffende Daten verarbeitet werden und auf Auskunft \xFCber diese Daten sowie auf weitere Informationen und Kopie der Daten entsprechend Art. 15 DSGVO.');
    var $receiver_0_62 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_61.child_2usv9w$($receiver_0_62.create());
    $receiver_0_61.unaryPlus_pdl1vz$('Sie haben entsprechend.Art.16 DSGVO das Recht, die Vervollst\xE4ndigung der Sie betreffenden Daten oder die Berichtigung der Sie betreffenden unrichtigen Daten zu verlangen.');
    var $receiver_0_63 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_61.child_2usv9w$($receiver_0_63.create());
    $receiver_0_61.unaryPlus_pdl1vz$('Sie haben nach Ma\xDFgabe des Art . 17 DSGVO das Recht zu verlangen, dass betreffende Daten unverz\xFCglich gel\xF6scht werden, bzw. alternativ nach Ma\xDFgabe des Art. 18 DSGVO eine Einschr\xE4nkung der Verarbeitung der Daten zu verlangen.');
    var $receiver_0_64 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_61.child_2usv9w$($receiver_0_64.create());
    $receiver_0_61.unaryPlus_pdl1vz$('Sie haben das Recht zu verlangen, dass die Sie betreffenden Daten, die Sie uns bereitgestellt haben nach Ma\xDFgabe des Art. 20 DSGVO zu erhalten und deren \xDCbermittlung an andere Verantwortliche zu fordern.');
    var $receiver_0_65 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_61.child_2usv9w$($receiver_0_65.create());
    $receiver_0_61.unaryPlus_pdl1vz$('Sie haben ferner gem . Art . 77 DSGVO das Recht, eine Beschwerde bei der zust\xE4ndigen Aufsichtsbeh\xF6rde einzureichen.');
    $receiver_0_59.child_2usv9w$($receiver_0_61.create());
    $receiver_0.child_2usv9w$($receiver_0_59.create());
    var $receiver_0_66 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_67 = new RDOMBuilder_init(h3$lambda_0('dsg-general-revokeconsent'));
    $receiver_0_67.unaryPlus_pdl1vz$('Widerrufsrecht');
    $receiver_0_66.child_2usv9w$($receiver_0_67.create());
    var $receiver_0_68 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_68.unaryPlus_pdl1vz$('Sie haben das Recht, erteilte Einwilligungen gem. Art. 7 Abs. 3 DSGVO mit Wirkung f\xFCr die Zukunft zu widerrufen');
    $receiver_0_66.child_2usv9w$($receiver_0_68.create());
    $receiver_0.child_2usv9w$($receiver_0_66.create());
    var $receiver_0_69 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_70 = new RDOMBuilder_init(h3$lambda_0('dsg-general-object'));
    $receiver_0_70.unaryPlus_pdl1vz$('Widerspruchsrecht');
    $receiver_0_69.child_2usv9w$($receiver_0_70.create());
    var $receiver_0_71 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_71.unaryPlus_pdl1vz$('Sie k\xF6nnen der k\xFCnftigen Verarbeitung der Sie betreffenden Daten nach Ma\xDFgabe des Art.21 DSGVO jederzeit widersprechen . Der Widerspruch kann insbesondere gegen die Verarbeitung f\xFCr Zwecke der Direktwerbung erfolgen.');
    $receiver_0_69.child_2usv9w$($receiver_0_71.create());
    $receiver_0.child_2usv9w$($receiver_0_69.create());
    var $receiver_0_72 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_73 = new RDOMBuilder_init(h3$lambda_0('dsg-general-cookies'));
    $receiver_0_73.unaryPlus_pdl1vz$('Cookies und Widerspruchsrecht bei Direktwerbung');
    $receiver_0_72.child_2usv9w$($receiver_0_73.create());
    var $receiver_0_74 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_74.unaryPlus_pdl1vz$('Als \u201ECookies\u201C werden kleine Dateien bezeichnet, die auf Rechnern der Nutzer gespeichert werden. Innerhalb der Cookies k\xF6nnen unterschiedliche Angaben gespeichert werden. Ein Cookie dient prim\xE4r dazu, die Angaben zu einem Nutzer (bzw. dem Ger\xE4t auf dem das Cookie gespeichert ist) w\xE4hrend oder auch nach seinem Besuch innerhalb eines Onlineangebotes zu speichern. Als tempor\xE4re Cookies, bzw. \u201ESession-Cookies\u201C oder \u201Etransiente Cookies\u201C, werden Cookies bezeichnet, die gel\xF6scht werden, nachdem ein Nutzer ein Onlineangebot verl\xE4sst und seinen Browser schlie\xDFt. In einem solchen Cookie kann z.B. der Inhalt eines Warenkorbs in einem Onlineshop oder ein Login-Status gespeichert werden. Als \u201Epermanent\u201C oder \u201Epersistent\u201C werden Cookies bezeichnet, die auch nach dem Schlie\xDFen des Browsers gespeichert bleiben. So kann z.B. der Login-Status gespeichert werden, wenn die Nutzer diese nach mehreren Tagen aufsuchen. Ebenso k\xF6nnen in einem solchen Cookie die Interessen der Nutzer gespeichert werden, die f\xFCr Reichweitenmessung oder Marketingzwecke verwendet werden. Als \u201EThird-Party-Cookie\u201C werden Cookies bezeichnet, die von anderen Anbietern als dem Verantwortlichen, der das Onlineangebot betreibt, angeboten werden (andernfalls, wenn es nur dessen Cookies sind spricht man von \u201EFirst-Party Cookies\u201C).');
    var $receiver_0_75 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_74.child_2usv9w$($receiver_0_75.create());
    $receiver_0_74.unaryPlus_pdl1vz$('Wir k\xF6nnen tempor\xE4re und permanente Cookies einsetzen und kl\xE4ren hier\xFCber im Rahmen unserer Datenschutzerkl\xE4rung auf.');
    var $receiver_0_76 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_74.child_2usv9w$($receiver_0_76.create());
    $receiver_0_74.unaryPlus_pdl1vz$('Falls die Nutzer nicht m\xF6chten, dass Cookies auf ihrem Rechner gespeichert werden, werden sie gebeten die entsprechende Option in den Systemeinstellungen ihres Browsers zu deaktivieren. Gespeicherte Cookies k\xF6nnen in den Systemeinstellungen des Browsers gel\xF6scht werden. Der Ausschluss von Cookies kann zu Funktionseinschr\xE4nkungen dieses Onlineangebotes f\xFChren.');
    var $receiver_0_77 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_74.child_2usv9w$($receiver_0_77.create());
    $receiver_0_74.unaryPlus_pdl1vz$('Ein genereller Widerspruch gegen den Einsatz der zu Zwecken des Onlinemarketing eingesetzten Cookies kann bei einer Vielzahl der Dienste, vor allem im Fall des Trackings, \xFCber die US-amerikanische Seite');
    var $receiver_0_78 = new RDOMBuilder_init(a$lambda_0('http://www.aboutads.info/choices/', null, null));
    $receiver_0_78.unaryPlus_pdl1vz$('http://www.aboutads.info/choices/');
    $receiver_0_74.child_2usv9w$($receiver_0_78.create());
    $receiver_0_74.unaryPlus_pdl1vz$('oder die EU-Seite');
    var $receiver_0_79 = new RDOMBuilder_init(a$lambda_0('http://www.youronlinechoices.com/', null, null));
    $receiver_0_79.unaryPlus_pdl1vz$('http://www.youronlinechoices.com/');
    $receiver_0_74.child_2usv9w$($receiver_0_79.create());
    $receiver_0_74.unaryPlus_pdl1vz$(' erkl\xE4rt werden. Des Weiteren kann die Speicherung von Cookies mittels deren Abschaltung in den Einstellungen des Browsers erreicht werden. Bitte beachten Sie, dass dann gegebenenfalls nicht alle Funktionen dieses Onlineangebotes genutzt werden k\xF6nnen.');
    $receiver_0_72.child_2usv9w$($receiver_0_74.create());
    $receiver_0.child_2usv9w$($receiver_0_72.create());
    var $receiver_0_80 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_81 = new RDOMBuilder_init(h3$lambda_0('dsg-general-erasure'));
    $receiver_0_81.unaryPlus_pdl1vz$('L\xF6schung von Daten');
    $receiver_0_80.child_2usv9w$($receiver_0_81.create());
    var $receiver_0_82 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_82.unaryPlus_pdl1vz$('Die von uns verarbeiteten Daten werden nach Ma\xDFgabe der Art. 17 und 18 DSGVO gel\xF6scht oder in ihrer Verarbeitung eingeschr\xE4nkt. Sofern nicht im Rahmen dieser Datenschutzerkl\xE4rung ausdr\xFCcklich angegeben, werden die bei uns gespeicherten Daten gel\xF6scht, sobald sie f\xFCr ihre Zweckbestimmung nicht mehr erforderlich sind und der L\xF6schung keine gesetzlichen Aufbewahrungspflichten entgegenstehen. Sofern die Daten nicht gel\xF6scht werden, weil sie f\xFCr andere und gesetzlich zul\xE4ssige Zwecke erforderlich sind, wird deren Verarbeitung eingeschr\xE4nkt. D.h. die Daten werden gesperrt und nicht f\xFCr andere Zwecke verarbeitet. Das gilt z.B. f\xFCr Daten, die aus handels- oder steuerrechtlichen Gr\xFCnden aufbewahrt werden m\xFCssen.');
    var $receiver_0_83 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_82.child_2usv9w$($receiver_0_83.create());
    $receiver_0_82.unaryPlus_pdl1vz$('Nach gesetzlichen Vorgaben in Deutschland, erfolgt die Aufbewahrung insbesondere f\xFCr 10 Jahre gem\xE4\xDF \xA7\xA7 147 Abs. 1 AO, 257 Abs. 1 Nr. 1 und 4, Abs. 4 HGB (B\xFCcher, Aufzeichnungen, Lageberichte, Buchungsbelege, Handelsb\xFCcher, f\xFCr Besteuerung relevanter Unterlagen, etc.) und 6 Jahre gem\xE4\xDF \xA7 257 Abs. 1 Nr. 2 und 3, Abs. 4 HGB (Handelsbriefe).');
    var $receiver_0_84 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_82.child_2usv9w$($receiver_0_84.create());
    $receiver_0_82.unaryPlus_pdl1vz$('Nach gesetzlichen Vorgaben in \xD6sterreich erfolgt die Aufbewahrung insbesondere f\xFCr 7 J gem\xE4\xDF \xA7 132 Abs. 1 BAO (Buchhaltungsunterlagen, Belege/Rechnungen, Konten, Belege, Gesch\xE4ftspapiere, Aufstellung der Einnahmen und Ausgaben, etc.), f\xFCr 22 Jahre im Zusammenhang mit Grundst\xFCcken und f\xFCr 10 Jahre bei Unterlagen im Zusammenhang mit elektronisch erbrachten Leistungen, Telekommunikations-, Rundfunk-und Fernsehleistungen, die an Nichtunternehmer in EU-Mitgliedstaaten erbracht werden und f\xFCr die der Mini-One-Stop-Shop (MOSS) in Anspruch genommen wird.');
    $receiver_0_80.child_2usv9w$($receiver_0_82.create());
    var $receiver_0_85 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_80.child_2usv9w$($receiver_0_85.create());
    $receiver_0.child_2usv9w$($receiver_0_80.create());
    var $receiver_0_86 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_87 = new RDOMBuilder_init(h3$lambda_0('dsg-commercialpurpose'));
    $receiver_0_87.unaryPlus_pdl1vz$('Gesch\xE4ftsbezogene Verarbeitung');
    $receiver_0_86.child_2usv9w$($receiver_0_87.create());
    var $receiver_0_88 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_89 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_89.unaryPlus_pdl1vz$('Zus\xE4tzlich verarbeiten wir');
    var $receiver_0_90 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_89.child_2usv9w$($receiver_0_90.create());
    $receiver_0_89.unaryPlus_pdl1vz$('- Vertragsdaten(z.B., Vertragsgegenstand, Laufzeit, Kundenkategorie).');
    var $receiver_0_91 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_89.child_2usv9w$($receiver_0_91.create());
    $receiver_0_89.unaryPlus_pdl1vz$('- Zahlungsdaten(z.B., Bankverbindung, Zahlungshistorie)');
    var $receiver_0_92 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_89.child_2usv9w$($receiver_0_92.create());
    $receiver_0_89.unaryPlus_pdl1vz$('von unseren Kunden, Interessenten und Gesch\xE4ftspartner zwecks Erbringung vertraglicher Leistungen, Service und Kundenpflege, Marketing, Werbung und Marktforschung.');
    $receiver_0_88.child_2usv9w$($receiver_0_89.create());
    $receiver_0_86.child_2usv9w$($receiver_0_88.create());
    var $receiver_0_93 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_86.child_2usv9w$($receiver_0_93.create());
    $receiver_0.child_2usv9w$($receiver_0_86.create());
    var $receiver_0_94 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_95 = new RDOMBuilder_init(h3$lambda_0('dsg-services-agents'));
    $receiver_0_95.unaryPlus_pdl1vz$('Maklerleistungen');
    $receiver_0_94.child_2usv9w$($receiver_0_95.create());
    var $receiver_0_96 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_97 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_97.unaryPlus_pdl1vz$('Wir verarbeiten die Daten unserer Kunden, Klienten und Interessenten (einheitlich bezeichnet als \u201EKunden\u201C) entsprechen Art. 6 Abs. 1 lit. b. DSGVO, um ihnen gegen\xFCber unsere vertraglichen oder vorvertraglichen Leistungen zu erbringen.  Die hierbei verarbeiteten Daten, die Art, der Umfang und der Zweck und die Erforderlichkeit ihrer Verarbeitung bestimmen sich nach dem zugrundeliegenden Auftrag. Dazu geh\xF6ren grunds\xE4tzlich Bestands-und Stammdaten der Kunden (Name, Adresse, etc.), als auch die Kontaktdaten (E-Mailadresse, Telefon, etc.), die Vertragsdaten (Inhalt der Beauftragung, Entgelte, Laufzeiten, Angaben zu den vermittelten Unternehmen/ Versicherern/ Leistungen) und Zahlungsdaten (Provisionen, Zahlungshistorie, etc.). Wir k\xF6nnen ferner die Angaben zu den Eigenschaften und Umst\xE4nden von Personen oder ihnen geh\xF6renden Sachen verarbeiten, wenn dies zum Gegenstand unseres Auftrags geh\xF6rt. Dies k\xF6nnen z.B. Angaben zu pers\xF6nlichen Lebensumst\xE4nden, mobilen oder immobilen Sachg\xFCtern sein.');
    var $receiver_0_98 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_97.child_2usv9w$($receiver_0_98.create());
    $receiver_0_97.unaryPlus_pdl1vz$('In Rahmen unserer Beauftragung kann es auch erforderlich sein, dass wir besondere Kategorien von Daten gem. Art. 9 Abs. 1 DSGVO, hier insbesondere Angaben zur Gesundheit einer Person verarbeiten. Hierzu holen wir, sofern erforderlich, gem. Art. 6 Abs. 1 lit a., Art. 7, Art. 9 Abs. 2 lit. a DSGVO eine ausdr\xFCckliche Einwilligung der Kunden ein.');
    var $receiver_0_99 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_97.child_2usv9w$($receiver_0_99.create());
    $receiver_0_97.unaryPlus_pdl1vz$('Sofern f\xFCr die Vertragserf\xFCllung oder gesetzlich erforderlich, offenbaren oder \xFCbermitteln wir die Daten der Kunden im Rahmen von Deckungsanfragen, Abschl\xFCssen und Abwicklungen von Vertr\xE4gen Daten an Anbieter der vermittelten Leistungen/ Objekte, Versicherer, R\xFCckversicherer, Maklerpools, technische Dienstleister, sonstige Dienstleister, wie z.B. kooperierende Verb\xE4nde, sowie Finanzdienstleister, Kreditinstitute und Kapitalanlagegesellschaften sowie Sozialversicherungstr\xE4ger, Steuerbeh\xF6rden, Steuerberater, Rechtsberater, Wirtschaftspr\xFCfer, Versicherungs-Ombudsm\xE4nner und die Anstalten Bundesanstalt f\xFCr Finanzdienstleistungsaufsicht (BaFin). Ferner k\xF6nnen wir Unterauftragnehmer beauftragen, wie z.B. Untervermittler. Wir holen eine Einwilligung der Kunden ein, sofern diese zur Offenbarung/ \xDCbermittlung eine Einwilligung der Kunden erforderlich ist (was z.B. im Fall von besonderen Kategorien von Daten gem. Art. 9 DSGVO der Fall sein kann).');
    var $receiver_0_100 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_97.child_2usv9w$($receiver_0_100.create());
    $receiver_0_97.unaryPlus_pdl1vz$('Die L\xF6schung der Daten erfolgt nach Ablauf gesetzlicher Gew\xE4hrleistungs - und vergleichbarer Pflichten, wobei die Erforderlichkeit der Aufbewahrung der Daten alle drei Jahre \xFCberpr\xFCft wird; im \xDCbrigen gelten die gesetzlichen Aufbewahrungspflichten .');
    var $receiver_0_101 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_97.child_2usv9w$($receiver_0_101.create());
    $receiver_0_97.unaryPlus_pdl1vz$('Im Fall der gesetzlichen Archivierungspflichten erfolgt die L\xF6schung nach deren Ablauf.Aufbewahrungspflichtig sind insbesondere nach deutschem Recht in der Versicherungs - und Finanzbranche Beratungsprotokolle f\xFCr 5 Jahre, Maklerschlussnoten f\xFCr 7 Jahre und Maklervertr\xE4ge f\xFCr 5 Jahres sowie generell 6 Jahre f\xFCr handelsrechtlich relevante Unterlagen und 10 Jahre f\xFCr steuerrechtlich relevante Unterlagen.');
    var $receiver_0_102 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_97.child_2usv9w$($receiver_0_102.create());
    $receiver_0_96.child_2usv9w$($receiver_0_97.create());
    $receiver_0_94.child_2usv9w$($receiver_0_96.create());
    var $receiver_0_103 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_94.child_2usv9w$($receiver_0_103.create());
    $receiver_0.child_2usv9w$($receiver_0_94.create());
    var $receiver_0_104 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_105 = new RDOMBuilder_init(h3$lambda_0('dsg-services-payment'));
    $receiver_0_105.unaryPlus_pdl1vz$('Externe Zahlungsdienstleister');
    $receiver_0_104.child_2usv9w$($receiver_0_105.create());
    var $receiver_0_106 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_107 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_107.unaryPlus_pdl1vz$('Wir setzen externe Zahlungsdienstleister ein, \xFCber deren Plattformen die Nutzer und wir Zahlungstransaktionen vornehmen k\xF6nnen (z.B., jeweils mit Link zur Datenschutzerkl\xE4rung, Paypal (https://www.paypal.com/de/webapps/mpp/ua/privacy-full), Klarna (https://www.klarna.com/de/datenschutz/), Skrill (https://www.skrill.com/de/fusszeile/datenschutzrichtlinie/), Giropay (https://www.giropay.de/rechtliches/datenschutz-agb/), Visa (https://www.visa.de/datenschutz), Mastercard (https://www.mastercard.de/de-de/datenschutz.html), American Express (https://www.americanexpress.com/de/content/privacy-policy-statement.html)');
    var $receiver_0_108 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_108.create());
    var $receiver_0_109 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_109.create());
    $receiver_0_107.unaryPlus_pdl1vz$('Im Rahmen der Erf\xFCllung von&nbsp;Vertr\xE4gen setzen wir die Zahlungsdienstleister auf Grundlage des Art.6 Abs . 1 lit. b. DSGVO ein. Im \xDCbrigen setzen wir externe&nbsp;Zahlungsdienstleister auf Grundlage unserer berechtigten Interessen gem.Art.6 Abs . 1 lit. f. DSGVO ein, um unseren Nutzern effektive und sichere Zahlungsm\xF6glichkeit zu bieten.');
    var $receiver_0_110 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_110.create());
    var $receiver_0_111 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_111.create());
    $receiver_0_107.unaryPlus_pdl1vz$('Zu den, durch die Zahlungsdienstleister verarbeiteten Daten geh\xF6ren Bestandsdaten, wie z.B. der Name und die Adresse, Bankdaten, wie z.B. Kontonummern oder Kreditkartennummern, Passw\xF6rter, TANs und Pr\xFCfsummen sowie die Vertrags-, Summen und empf\xE4ngerbezogenen Angaben. Die Angaben sind erforderlich, um die Transaktionen durchzuf\xFChren. Die eingegebenen Daten werden jedoch nur durch die Zahlungsdienstleister verarbeitet und bei diesen gespeichert. D.h. wir erhalten keine konto-oder kreditkartenbezogenen Informationen, sondern lediglich Informationen mit Best\xE4tigung oder Negativbeauskunftung der Zahlung.&nbsp;Unter Umst\xE4nden werden die Daten seitens der Zahlungsdienstleister an Wirtschaftsauskunfteien \xFCbermittelt.Diese \xDCbermittlung bezweckt die Identit\xE4ts - und Bonit\xE4tspr\xFCfung . Hierzu verweisen wir auf die AGB und Datenschutzhinweise der & nbsp;Zahlungsdienstleister.');
    var $receiver_0_112 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_112.create());
    var $receiver_0_113 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_107.child_2usv9w$($receiver_0_113.create());
    $receiver_0_107.unaryPlus_pdl1vz$('F\xFCr die Zahlungsgesch\xE4fte gelten die Gesch\xE4ftsbedingungen und die Datenschutzhinweise der jeweiligen Zahlungsdienstleister, welche innerhalb der jeweiligen Webseiten, bzw. Transaktionsapplikationen abrufbar sind. Wir verweisen auf diese ebenfalls zwecks weiterer Informationen und Geltendmachung von Widerrufs-, Auskunfts-und anderen Betroffenenrechten.');
    $receiver_0_106.child_2usv9w$($receiver_0_107.create());
    var $receiver_0_114 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_106.child_2usv9w$($receiver_0_114.create());
    $receiver_0_104.child_2usv9w$($receiver_0_106.create());
    $receiver_0.child_2usv9w$($receiver_0_104.create());
    var $receiver_0_115 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_116 = new RDOMBuilder_init(h3$lambda_0('dsg-administration'));
    $receiver_0_116.unaryPlus_pdl1vz$('Administration, Finanzbuchhaltung, B\xFCroorganisation, Kontaktverwaltung');
    $receiver_0_115.child_2usv9w$($receiver_0_116.create());
    var $receiver_0_117 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_118 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_118.unaryPlus_pdl1vz$('Wir verarbeiten Daten im Rahmen von Verwaltungsaufgaben sowie Organisation unseres Betriebs, Finanzbuchhaltung und Befolgung der gesetzlichen Pflichten, wie z.B. der Archivierung. Hierbei verarbeiten wir dieselben Daten, die wir im Rahmen der Erbringung unserer vertraglichen Leistungen verarbeiten. Die Verarbeitungsgrundlagen sind Art. 6 Abs. 1 lit. c. DSGVO, Art. 6 Abs. 1 lit. f. DSGVO. Von der Verarbeitung sind Kunden, Interessenten, Gesch\xE4ftspartner und Websitebesucher betroffen. Der Zweck und unser Interesse an der Verarbeitung liegt in der Administration, Finanzbuchhaltung, B\xFCroorganisation, Archivierung von Daten, also Aufgaben die der Aufrechterhaltung unserer Gesch\xE4ftst\xE4tigkeiten, Wahrnehmung unserer Aufgaben und Erbringung unserer Leistungen dienen. Die L\xF6schung der Daten im Hinblick auf vertragliche Leistungen und die vertragliche Kommunikation entspricht den, bei diesen Verarbeitungst\xE4tigkeiten genannten Angaben.');
    var $receiver_0_119 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_118.child_2usv9w$($receiver_0_119.create());
    var $receiver_0_120 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_118.child_2usv9w$($receiver_0_120.create());
    $receiver_0_118.unaryPlus_pdl1vz$('Wir offenbaren oder \xFCbermitteln hierbei Daten an die Finanzverwaltung, Berater, wie z.B., Steuerberater oder Wirtschaftspr\xFCfer sowie weitere Geb\xFChrenstellen und Zahlungsdienstleister.');
    var $receiver_0_121 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_118.child_2usv9w$($receiver_0_121.create());
    var $receiver_0_122 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_118.child_2usv9w$($receiver_0_122.create());
    $receiver_0_118.unaryPlus_pdl1vz$('Ferner speichern wir auf Grundlage unserer betriebswirtschaftlichen Interessen Angaben zu Lieferanten, Veranstaltern und sonstigen Gesch\xE4ftspartnern, z.B. zwecks sp\xE4terer Kontaktaufnahme. Diese mehrheitlich unternehmensbezogenen Daten, speichern wir grunds\xE4tzlich dauerhaft.');
    var $receiver_0_123 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_118.child_2usv9w$($receiver_0_123.create());
    $receiver_0_117.child_2usv9w$($receiver_0_118.create());
    $receiver_0_115.child_2usv9w$($receiver_0_117.create());
    var $receiver_0_124 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_115.child_2usv9w$($receiver_0_124.create());
    $receiver_0.child_2usv9w$($receiver_0_115.create());
    var $receiver_0_125 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_126 = new RDOMBuilder_init(h3$lambda_0('dsg-contact'));
    $receiver_0_126.unaryPlus_pdl1vz$('Kontaktaufnahme');
    $receiver_0_125.child_2usv9w$($receiver_0_126.create());
    var $receiver_0_127 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_128 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_128.unaryPlus_pdl1vz$('Bei der Kontaktaufnahme mit uns(z.B.per Kontaktformular, E - Mail, Telefon oder via sozialer Medien) werden die Angaben des Nutzers zur Bearbeitung der Kontaktanfrage und deren Abwicklung gem . Art . 6 Abs. 1 lit. b. (im Rahmen vertraglicher-/vorvertraglicher Beziehungen), Art. 6 Abs. 1 lit. f. (andere Anfragen) DSGVO verarbeitet..Die Angaben der Nutzer k\xF6nnen in einem Customer-Relationship-Management System ("CRM System") oder vergleichbarer Anfragenorganisation gespeichert werden.');
    var $receiver_0_129 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_128.child_2usv9w$($receiver_0_129.create());
    var $receiver_0_130 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_128.child_2usv9w$($receiver_0_130.create());
    $receiver_0_128.unaryPlus_pdl1vz$('Wir l\xF6schen die Anfragen, sofern diese nicht mehr erforderlich sind. Wir \xFCberpr\xFCfen die Erforderlichkeit alle zwei Jahre; Ferner gelten die gesetzlichen Archivierungspflichten.');
    $receiver_0_127.child_2usv9w$($receiver_0_128.create());
    $receiver_0_125.child_2usv9w$($receiver_0_127.create());
    $receiver_0.child_2usv9w$($receiver_0_125.create());
    var $receiver_0_131 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_132 = new RDOMBuilder_init(h3$lambda_0('dsg-newsletter-de'));
    $receiver_0_132.unaryPlus_pdl1vz$('Newsletter');
    $receiver_0_131.child_2usv9w$($receiver_0_132.create());
    var $receiver_0_133 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_134 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_134.unaryPlus_pdl1vz$('Mit den nachfolgenden Hinweisen informieren wir Sie \xFCber die Inhalte unseres Newsletters sowie das Anmelde -, Versand-und das statistische Auswertungsverfahren sowie Ihre Widerspruchsrechte auf. Indem Sie unseren Newsletter abonnieren, erkl\xE4ren Sie sich mit dem Empfang und den beschriebenen Verfahren einverstanden.');
    var $receiver_0_135 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_135.create());
    $receiver_0_134.unaryPlus_pdl1vz$('Inhalt des Newsletters: Wir versenden Newsletter, E-Mails und weitere elektronische Benachrichtigungen mit werblichen Informationen (nachfolgend \u201ENewsletter\u201C) nur mit der Einwilligung der Empf\xE4nger oder einer gesetzlichen Erlaubnis. Sofern im Rahmen einer Anmeldung zum Newsletter dessen Inhalte konkret umschrieben werden, sind sie f\xFCr die Einwilligung der Nutzer ma\xDFgeblich. Im \xDCbrigen enthalten unsere Newsletter Informationen zu unseren Leistungen und uns.');
    var $receiver_0_136 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_136.create());
    $receiver_0_134.unaryPlus_pdl1vz$('Double - Opt - In und Protokollierung: Die Anmeldung zu unserem Newsletter erfolgt in einem sog. Double-Opt-In-Verfahren. D.h. Sie erhalten nach der Anmeldung eine E-Mail, in der Sie um die Best\xE4tigung Ihrer Anmeldung gebeten werden. Diese Best\xE4tigung ist notwendig, damit sich niemand mit fremden E-Mailadressen anmelden kann. Die Anmeldungen zum Newsletter werden protokolliert, um den Anmeldeprozess entsprechend den rechtlichen Anforderungen nachweisen zu k\xF6nnen. Hierzu geh\xF6rt die Speicherung des Anmelde-und des Best\xE4tigungszeitpunkts, als auch der IP-Adresse. Ebenso werden die \xC4nderungen Ihrer bei dem Versanddienstleister gespeicherten Daten protokolliert.');
    var $receiver_0_137 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_137.create());
    $receiver_0_134.unaryPlus_pdl1vz$('Anmeldedaten: Um sich f\xFCr den Newsletter anzumelden, reicht es aus, wenn Sie Ihre E-Mailadresse angeben. Optional bitten wir Sie einen Namen, zwecks pers\xF6nlicher Ansprache im Newsletters anzugeben.');
    var $receiver_0_138 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_138.create());
    $receiver_0_134.unaryPlus_pdl1vz$('Der Versand des Newsletters und die mit ihm verbundene Erfolgsmessung erfolgen auf Grundlage einer Einwilligung der Empf\xE4nger gem . Art . 6 Abs. 1 lit. a, Art. 7 DSGVO i.V.m \xA7 7 Abs. 2 Nr. 3 UWG oder falls eine Einwilligung nicht erforderlich ist, auf Grundlage unserer berechtigten Interessen am Direktmarketing gem. Art. 6 Abs. 1 lt. f. DSGVO i.V.m. \xA7 7 Abs. 3 UWG.');
    var $receiver_0_139 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_139.create());
    $receiver_0_134.unaryPlus_pdl1vz$('Die Protokollierung des Anmeldeverfahrens erfolgt auf Grundlage unserer berechtigten Interessen gem.Art.6 Abs . 1 lit. f DSGVO. Unser Interesse richtet sich auf den Einsatz eines nutzerfreundlichen sowie sicheren Newslettersystems, das sowohl unseren gesch\xE4ftlichen Interessen dient, als auch den Erwartungen der Nutzer entspricht und uns ferner den Nachweis von Einwilligungen erlaubt.');
    var $receiver_0_140 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_134.child_2usv9w$($receiver_0_140.create());
    $receiver_0_134.unaryPlus_pdl1vz$('K\xFCndigung / Widerruf - Sie k\xF6nnen den Empfang unseres Newsletters jederzeit k\xFCndigen, d.h. Ihre Einwilligungen widerrufen. Einen Link zur K\xFCndigung des Newsletters finden Sie am Ende eines jeden Newsletters. Wir k\xF6nnen die ausgetragenen E-Mailadressen bis zu drei Jahren auf Grundlage unserer berechtigten Interessen speichern bevor wir sie l\xF6schen, um eine ehemals gegebene Einwilligung nachweisen zu k\xF6nnen. Die Verarbeitung dieser Daten wird auf den Zweck einer m\xF6glichen Abwehr von Anspr\xFCchen beschr\xE4nkt. Ein individueller L\xF6schungsantrag ist jederzeit m\xF6glich, sofern zugleich das ehemalige Bestehen einer Einwilligung best\xE4tigt wird.');
    $receiver_0_133.child_2usv9w$($receiver_0_134.create());
    $receiver_0_131.child_2usv9w$($receiver_0_133.create());
    var $receiver_0_141 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_131.child_2usv9w$($receiver_0_141.create());
    $receiver_0.child_2usv9w$($receiver_0_131.create());
    var $receiver_0_142 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_143 = new RDOMBuilder_init(h3$lambda_0('dsg-hostingprovider'));
    $receiver_0_143.unaryPlus_pdl1vz$('Hosting und E - Mail - Versand');
    $receiver_0_142.child_2usv9w$($receiver_0_143.create());
    var $receiver_0_144 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_145 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_145.unaryPlus_pdl1vz$('Die von uns in Anspruch genommenen Hosting - Leistungen dienen der Zurverf\xFCgungstellung der folgenden Leistungen: Infrastruktur-und Plattformdienstleistungen, Rechenkapazit\xE4t, Speicherplatz und Datenbankdienste, E-Mail-Versand, Sicherheitsleistungen sowie technische Wartungsleistungen, die wir zum Zwecke des Betriebs dieses Onlineangebotes einsetzen.');
    var $receiver_0_146 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_145.child_2usv9w$($receiver_0_146.create());
    var $receiver_0_147 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_145.child_2usv9w$($receiver_0_147.create());
    $receiver_0_145.unaryPlus_pdl1vz$('Hierbei verarbeiten wir, bzw. unser Hostinganbieter Bestandsdaten, Kontaktdaten, Inhaltsdaten, Vertragsdaten, Nutzungsdaten, Meta-und Kommunikationsdaten von Kunden, Interessenten und Besuchern dieses Onlineangebotes auf Grundlage unserer berechtigten Interessen an einer effizienten und sicheren Zurverf\xFCgungstellung dieses Onlineangebotes gem. Art. 6 Abs. 1 lit. f DSGVO i.V.m. Art. 28 DSGVO (Abschluss Auftragsverarbeitungsvertrag).');
    $receiver_0_144.child_2usv9w$($receiver_0_145.create());
    $receiver_0_142.child_2usv9w$($receiver_0_144.create());
    var $receiver_0_148 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_142.child_2usv9w$($receiver_0_148.create());
    $receiver_0.child_2usv9w$($receiver_0_142.create());
    var $receiver_0_149 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_150 = new RDOMBuilder_init(h3$lambda_0('dsg-logfiles'));
    $receiver_0_150.unaryPlus_pdl1vz$('Erhebung von Zugriffsdaten und Logfiles');
    $receiver_0_149.child_2usv9w$($receiver_0_150.create());
    var $receiver_0_151 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_152 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_152.unaryPlus_pdl1vz$('Wir, bzw. unser Hostinganbieter, erhebt auf Grundlage unserer berechtigten Interessen im Sinne des Art. 6 Abs. 1 lit. f. DSGVO Daten \xFCber jeden Zugriff auf den Server, auf dem sich dieser Dienst befindet (sogenannte Serverlogfiles). Zu den Zugriffsdaten geh\xF6ren Name der abgerufenen Webseite, Datei, Datum und Uhrzeit des Abrufs, \xFCbertragene Datenmenge, Meldung \xFCber erfolgreichen Abruf, Browsertyp nebst Version, das Betriebssystem des Nutzers, Referrer URL (die zuvor besuchte Seite), IP-Adresse und der anfragende Provider.');
    var $receiver_0_153 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_152.child_2usv9w$($receiver_0_153.create());
    var $receiver_0_154 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_152.child_2usv9w$($receiver_0_154.create());
    $receiver_0_152.unaryPlus_pdl1vz$('Logfile - Informationen werden aus Sicherheitsgr\xFCnden (z.B.zur Aufkl\xE4rung von Missbrauchs -oder Betrugshandlungen) f\xFCr die Dauer von maximal 7 Tagen gespeichert und danach gel\xF6scht . Daten, deren weitere Aufbewahrung zu Beweiszwecken erforderlich ist, sind bis zur endg\xFCltigen Kl\xE4rung des jeweiligen Vorfalls von der L\xF6schung ausgenommen.');
    $receiver_0_151.child_2usv9w$($receiver_0_152.create());
    $receiver_0_149.child_2usv9w$($receiver_0_151.create());
    var $receiver_0_155 = new RDOMBuilder_init(p$lambda_1(null));
    $receiver_0_149.child_2usv9w$($receiver_0_155.create());
    $receiver_0.child_2usv9w$($receiver_0_149.create());
    var $receiver_0_156 = new RDOMBuilder_init(div$lambda_2(null));
    var $receiver_0_157 = new RDOMBuilder_init(h3$lambda_0('dsg-thirdparty-googlefonts'));
    $receiver_0_157.unaryPlus_pdl1vz$('Google Fonts');
    $receiver_0_156.child_2usv9w$($receiver_0_157.create());
    var $receiver_0_158 = new RDOMBuilder_init(p$lambda_1(null));
    var $receiver_0_159 = new RDOMBuilder_init(span$lambda_0('ts-muster-content'));
    $receiver_0_159.unaryPlus_pdl1vz$('Wir binden die Schriftarten ("Google Fonts") des Anbieters Google LLC, 1600 Amphitheatre Parkway, Mountain View, CA 94043, USA, ein. Datenschutzerkl\xE4rung: ');
    var $receiver_0_160 = new RDOMBuilder_init(a$lambda_0('https://www.google.com/policies/privacy/', '_blank', null));
    $receiver_0_160.unaryPlus_pdl1vz$('https://www.google.com/policies/privacy/');
    $receiver_0_159.child_2usv9w$($receiver_0_160.create());
    $receiver_0_159.unaryPlus_pdl1vz$(', Opt-Out: ');
    var $receiver_0_161 = new RDOMBuilder_init(a$lambda_0('https://adssettings.google.com/authenticated', '_blank', null));
    $receiver_0_161.unaryPlus_pdl1vz$('https://adssettings.google.com/authenticated');
    $receiver_0_159.child_2usv9w$($receiver_0_161.create());
    var $receiver_0_162 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_159.child_2usv9w$($receiver_0_162.create());
    var $receiver_0_163 = new RDOMBuilder_init(br$lambda(null));
    $receiver_0_159.child_2usv9w$($receiver_0_163.create());
    var $receiver_0_164 = new RDOMBuilder_init(a$lambda_0('https://datenschutz-generator.de', '_blank', 'dsg1-5'));
    $receiver_0_164.unaryPlus_pdl1vz$('Erstellt mit Datenschutz-Generator.de von RA Dr. Thomas Schwenke');
    $receiver_0_159.child_2usv9w$($receiver_0_164.create());
    $receiver_0_158.child_2usv9w$($receiver_0_159.create());
    $receiver_0_156.child_2usv9w$($receiver_0_158.create());
    $receiver_0.child_2usv9w$($receiver_0_156.create());
    $receiver.child_2usv9w$($receiver_0.create());
    footer($receiver, new FooterData('\xA9 2018 Copyright Text', createLinks(listOf([new Pair('#', 'About'), new Pair('#', 'Login'), new Pair('#', 'Help')])), createElement('a', new About$render$ObjectLiteral(), 'Impressum'), About$render$lambda));
  };
  About.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'About',
    interfaces: [RComponent]
  };
  function about$lambda($receiver) {
    return Unit;
  }
  function about($receiver) {
    return $receiver.child_bzgiuu$(getKClass(About), about$lambda);
  }
  function App() {
    RComponent_init_0(this);
  }
  App.prototype.componentWillMount = function () {
    questionRepo.root();
  };
  function App$render$lambda$lambda$lambda($receiver) {
    route($receiver, '/', getKClass(Home), true);
    route($receiver, '/about', getKClass(About));
    route($receiver, '/questionnaire', getKClass(Questionnaire));
    return Unit;
  }
  function div$lambda_3(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function App$render$lambda($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_3('content'));
    nav($receiver_0);
    switch_0($receiver_0, App$render$lambda$lambda$lambda);
    $receiver.child_2usv9w$($receiver_0.create());
    return Unit;
  }
  App.prototype.render_ss14n$ = function ($receiver) {
    browserRouter($receiver, '/hausbewerter-js', App$render$lambda);
  };
  App.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'App',
    interfaces: [RComponent]
  };
  function app$lambda($receiver) {
    return Unit;
  }
  function app($receiver) {
    return $receiver.child_bzgiuu$(getKClass(App), app$lambda);
  }
  var imgHouse;
  var imgMountain;
  function Home() {
    RComponent_init_0(this);
  }
  function h3$lambda_1(closure$classes) {
    return function (it) {
      return new H3_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function h5$lambda_0(closure$classes) {
    return function (it) {
      return new H5_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function Home$render$lambda$lambda$ObjectLiteral() {
  }
  Home$render$lambda$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  var I_init = $module$kotlin_react_dom.$$importsForInline$$['kotlinx-html-js'].kotlinx.html.I;
  function i$lambda(closure$classes) {
    return function (it) {
      return new I_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function p$lambda_2(closure$classes) {
    return function (it) {
      return new P_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function Home$render$lambda$lambda$lambda($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('store');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function Home$render$lambda$lambda$ObjectLiteral_0() {
  }
  Home$render$lambda$lambda$ObjectLiteral_0.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda$lambda$lambda_0($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('room');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function Home$render$lambda$lambda$ObjectLiteral_1() {
  }
  Home$render$lambda$lambda$ObjectLiteral_1.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda$lambda$lambda_1($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('schedule');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function Home$render$lambda$lambda$ObjectLiteral_2() {
  }
  Home$render$lambda$lambda$ObjectLiteral_2.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda$lambda$lambda_2($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('euro_symbol');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function Home$render$lambda$lambda$ObjectLiteral_3() {
  }
  Home$render$lambda$lambda$ObjectLiteral_3.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda$lambda$lambda_3($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('lock');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function Home$render$lambda$lambda$ObjectLiteral_4() {
  }
  Home$render$lambda$lambda$ObjectLiteral_4.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda$lambda$lambda_4($receiver) {
    var $receiver_0 = new RDOMBuilder_init(p$lambda_2('card-body'));
    var $receiver_0_0 = new RDOMBuilder_init(i$lambda('material-icons center medium'));
    $receiver_0_0.unaryPlus_pdl1vz$('grade');
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyHeader());
    $receiver.child_2usv9w$($receiver_0_1.create());
    return Unit;
  }
  function div$lambda_4(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function Home$render$ObjectLiteral() {
    this.href = '#';
  }
  Home$render$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function Home$render$lambda($receiver) {
    var $receiver_0 = new RDOMBuilder_init(h5$lambda_0(null));
    $receiver_0.unaryPlus_pdl1vz$(footerHeader());
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_0 = new RDOMBuilder_init(p$lambda_2(null));
    $receiver_0_0.unaryPlus_pdl1vz$(footerContent());
    $receiver.child_2usv9w$($receiver_0_0.create());
    return Unit;
  }
  Home.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_4(null));
    parallax($receiver_0, new ParallaxData(imgHouse));
    var $receiver_0_0 = new RDOMBuilder_init(div$lambda_4('App-intro'));
    logo($receiver_0_0);
    var $receiver_0_1 = new RDOMBuilder_init(h3$lambda_1(null));
    $receiver_0_1.unaryPlus_pdl1vz$(appIntroHeader());
    $receiver_0_0.child_2usv9w$($receiver_0_1.create());
    var $receiver_0_2 = new RDOMBuilder_init(h5$lambda_0(null));
    $receiver_0_2.unaryPlus_pdl1vz$(appIntroSubHeader());
    $receiver_0_0.child_2usv9w$($receiver_0_2.create());
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    var $receiver_0_3 = new RDOMBuilder_init(div$lambda_4('App-body'));
    body($receiver_0_3);
    parallax($receiver_0_3, new ParallaxData(imgHouse));
    cardRow($receiver_0_3, listOf([new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral(), bodyWelcome()), 'offset-m2 offset-l3', void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda), new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral_0(), bodyWelcome()), void 0, void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda_0), new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral_1(), bodyWelcome()), void 0, void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda_1)]));
    cardRow($receiver_0_3, listOf([new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral_2(), bodyWelcome()), 'offset-m2 offset-l3', void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda_2), new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral_3(), bodyWelcome()), void 0, void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda_3), new CardData('', createElement('p', new Home$render$lambda$lambda$ObjectLiteral_4(), bodyWelcome()), void 0, void 0, new CardTitleData(void 0, void 0, imgMountain, 'Test'), Home$render$lambda$lambda$lambda_4)]));
    $receiver_0.child_2usv9w$($receiver_0_3.create());
    $receiver.child_2usv9w$($receiver_0.create());
    footer($receiver, new FooterData('\xA9 2018 Copyright Text', createLinks(listOf([new Pair('#', 'About'), new Pair('#', 'Login'), new Pair('#', 'Help')])), createElement('a', new Home$render$ObjectLiteral(), 'Impressum'), Home$render$lambda));
  };
  Home.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Home',
    interfaces: [RComponent]
  };
  function Body() {
    RComponent_init_0(this);
  }
  function Body$render$lambda$lambda$lambda$lambda(it) {
    return Unit;
  }
  function Body$render$lambda$lambda$lambda($receiver) {
    button($receiver, buttonTry(), void 0, Body$render$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function h2$lambda_0(closure$classes) {
    return function (it) {
      return new H2_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  Body.prototype.render_ss14n$ = function ($receiver) {
    var $receiver_0 = new RDOMBuilder_init(div$lambda_4('Body-text'));
    var $receiver_0_0 = new RDOMBuilder_init(h2$lambda_0('Body-header'));
    $receiver_0_0.unaryPlus_pdl1vz$(bodyHeader());
    $receiver_0.child_2usv9w$($receiver_0_0.create());
    var $receiver_0_1 = new RDOMBuilder_init(div$lambda_4('Body-welcome'));
    $receiver_0_1.unaryPlus_pdl1vz$(bodyWelcome());
    $receiver_0.child_2usv9w$($receiver_0_1.create());
    var $receiver_0_2 = new RDOMBuilder_init(div$lambda_4('Body-try-button'));
    link($receiver_0_2, '/questionnaire', Body$render$lambda$lambda$lambda);
    $receiver_0.child_2usv9w$($receiver_0_2.create());
    $receiver.child_2usv9w$($receiver_0.create());
  };
  Body.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Body',
    interfaces: [RComponent]
  };
  function home$lambda($receiver) {
    return Unit;
  }
  function home($receiver) {
    return $receiver.child_bzgiuu$(getKClass(Home), home$lambda);
  }
  function body$lambda($receiver) {
    return Unit;
  }
  function body($receiver) {
    return $receiver.child_bzgiuu$(getKClass(Body), body$lambda);
  }
  function Nav(props) {
    RComponent_init(props, this);
  }
  function Nav$render$lambda$lambda() {
    console.log('click About');
    return Unit;
  }
  function Nav$render$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('About');
    return Unit;
  }
  function Nav$render$lambda$lambda_0($receiver) {
    link($receiver, '/about', Nav$render$lambda$lambda$lambda);
    return Unit;
  }
  function Nav$render$lambda$lambda_1($receiver) {
    return Unit;
  }
  function Nav$render$lambda$lambda_2() {
    console.log('click Login');
    return Unit;
  }
  function i$lambda_0(closure$classes) {
    return function (it) {
      return new I_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function div$lambda_5(closure$classes) {
    return function (it) {
      return new DIV_init(attributesMapOf_0('class', closure$classes), it);
    };
  }
  function Nav$render$lambda$lambda_3($receiver) {
    $receiver.unaryPlus_pdl1vz$('Login');
    var $receiver_0 = new RDOMBuilder_init(i$lambda_0('material-icons right'));
    $receiver_0.unaryPlus_pdl1vz$('arrow_drop_down');
    $receiver.child_2usv9w$($receiver_0.create());
    var $receiver_0_0 = new RDOMBuilder_init(div$lambda_5('dropdown'));
    login($receiver_0_0);
    $receiver.child_2usv9w$($receiver_0_0.create());
    return Unit;
  }
  function Nav$render$lambda($receiver) {
    navItem($receiver, new NavItemData(Nav$render$lambda$lambda), Nav$render$lambda$lambda_0);
    navItem($receiver, new NavItemData(void 0, true), Nav$render$lambda$lambda_1);
    navItem($receiver, new NavItemData(Nav$render$lambda$lambda_2), Nav$render$lambda$lambda_3);
    return Unit;
  }
  Nav.prototype.render_ss14n$ = function ($receiver) {
    navBar($receiver, new NavBarData('/', void 0, void 0, void 0, appName()), Nav$render$lambda);
  };
  Nav.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Nav',
    interfaces: [RComponent]
  };
  function NavBrandCentralizer() {
    RComponent_init_0(this);
  }
  NavBrandCentralizer.prototype.componentDidMount = function () {
    var domNode = findDOMNode(this);
    var parent = domNode.parentNode;
    var prevElement = parent.previousElementSibling;
    if (prevElement != null && prevElement.matches('.brand-logo'))
      prevElement.className = prevElement.className + ' center';
  };
  NavBrandCentralizer.prototype.render_ss14n$ = function ($receiver) {
    $receiver.unaryPlus_pdl1vz$('');
  };
  NavBrandCentralizer.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'NavBrandCentralizer',
    interfaces: [RComponent]
  };
  function navBrandCentralizer$lambda($receiver) {
    return Unit;
  }
  function navBrandCentralizer($receiver) {
    return $receiver.child_bzgiuu$(getKClass(NavBrandCentralizer), navBrandCentralizer$lambda);
  }
  function nav$lambda($receiver) {
    return Unit;
  }
  function nav($receiver) {
    return $receiver.child_bzgiuu$(getKClass(Nav), nav$lambda);
  }
  function toJsonString($receiver) {
    if ($receiver == null)
      return '{}';
    return JSON.stringify($receiver);
  }
  function toJson($receiver) {
    if ($receiver == null)
      return json([]);
    return JSON.parse(toJsonString($receiver));
  }
  function appName() {
    return 'DIE HAUSBEWERTER';
  }
  function appHeader() {
    return appName();
  }
  function appIntroHeader() {
    return 'Herzlich Willkommen auf hausbewertung.de';
  }
  function appIntroSubHeader() {
    return 'Ihre Plattform f\xFCr die Verwaltung Ihrer Hausbewertungen.';
  }
  function bodyHeader() {
    return 'Starten Sie mit Ihrer ersten Bewertung - kostenlos und ohne Anmeldung';
  }
  function bodyWelcome() {
    return 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet,';
  }
  function buttonTry() {
    return 'Probebewertung';
  }
  function buttonLogin() {
    return 'Login';
  }
  function placeholderPassword() {
    return 'Passwort';
  }
  function placeholderUsername() {
    return 'Benutzername';
  }
  function registration() {
    return 'Registrieren';
  }
  function forgotPassword() {
    return 'Passwort vergessen?';
  }
  function navHome() {
    return 'Home';
  }
  function navContact() {
    return 'Kontakt';
  }
  function footerHeader() {
    return 'Footer Content';
  }
  function footerContent() {
    return 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.';
  }
  function currentResultHeader() {
    return 'Zwischenergebnis';
  }
  function endResultHeader() {
    return 'Herzlichen Gl\xFCckwunsch, hier ist Ihr Ergebnis.';
  }
  function nextRequestHeader() {
    return 'N\xE4chster Schritt';
  }
  function newQuestionnaire() {
    return 'Neu beginnen';
  }
  function backToHome() {
    return 'Zur\xFCck zur Hauptseite';
  }
  _.main_kand9s$ = main;
  var package$libraries = _.libraries || (_.libraries = {});
  var package$forms = package$libraries.forms || (package$libraries.forms = {});
  package$forms.FormProps = FormProps;
  package$forms.FormData = FormData;
  package$forms.form_f0k473$ = form;
  var package$react = package$libraries.react || (package$libraries.react = {});
  var package$material = package$react.material || (package$react.material = {});
  package$material.button_7j3y7p$ = button;
  package$material.navBar_8gmmwt$ = navBar;
  package$material.navItem_2ycrgt$ = navItem;
  package$material.parallax_lwke6f$ = parallax;
  package$material.input_plt490$ = input;
  package$material.card_e5pgdu$ = card;
  package$material.cardTitle_57oleu$ = cardTitle;
  package$material.row_isuyx8$ = row;
  package$material.col_bk74z6$ = col;
  package$material.footer_bgrkjn$ = footer;
  package$material.icon_lss73h$ = icon;
  var package$data = package$material.data || (package$material.data = {});
  package$data.ButtonDataProps = ButtonDataProps;
  package$data.ButtonProps = ButtonProps;
  package$data.ButtonData = ButtonData;
  package$data.CardProps = CardProps;
  package$data.CardTitleProps = CardTitleProps;
  package$data.CardData = CardData;
  package$data.CardTitleData = CardTitleData;
  package$data.FooterProps = FooterProps;
  package$data.FooterData = FooterData;
  package$data.createLinks_3efbss$ = createLinks;
  package$data.RowProps = RowProps;
  package$data.ColProps = ColProps;
  package$data.RowData = RowData;
  package$data.ColData = ColData;
  package$data.IconDataProps = IconDataProps;
  package$data.IconProps = IconProps;
  package$data.IconData = IconData;
  package$data.InputProps = InputProps;
  package$data.InputData = InputData;
  package$data.NavProps = NavProps;
  package$data.NavBarProps = NavBarProps;
  package$data.NavItemProps = NavItemProps;
  package$data.NavBarData = NavBarData;
  package$data.NavItemData = NavItemData;
  package$data.ParallaxProps = ParallaxProps;
  package$data.ParallaxData = ParallaxData;
  var package$router = package$react.router || (package$react.router = {});
  package$router.browserRouter_i3w5o2$ = browserRouter;
  package$router.switch_jg12zk$ = switch_0;
  package$router.route_uf5c6a$ = route;
  package$router.link_i3w5o2$ = link;
  var package$network = _.network || (_.network = {});
  Object.defineProperty(package$network, 'questionRepo', {
    get: function () {
      return questionRepo;
    }
  });
  var package$data_0 = package$network.data || (package$network.data = {});
  package$data_0.QuestionRepository = QuestionRepository;
  package$data_0.RemoteQuestionRepository = RemoteQuestionRepository;
  var package$schema = package$network.schema || (package$network.schema = {});
  Object.defineProperty(package$schema, 'RefResolver', {
    get: RefResolver_getInstance
  });
  Object.defineProperty(Relation, 'CREATE', {
    get: Relation$CREATE_getInstance
  });
  Object.defineProperty(Relation, 'BY_ID', {
    get: Relation$BY_ID_getInstance
  });
  Object.defineProperty(Relation, 'NEXT', {
    get: Relation$NEXT_getInstance
  });
  package$schema.Relation = Relation;
  package$schema.Schema = Schema;
  package$schema.Link = Link_0;
  Object.defineProperty(Method, 'GET', {
    get: Method$GET_getInstance
  });
  Object.defineProperty(Method, 'POST', {
    get: Method$POST_getInstance
  });
  Object.defineProperty(Method, 'PUT', {
    get: Method$PUT_getInstance
  });
  Object.defineProperty(Method, 'DELETE', {
    get: Method$DELETE_getInstance
  });
  Object.defineProperty(Method, 'PATCH', {
    get: Method$PATCH_getInstance
  });
  Object.defineProperty(Method, 'OPTIONS', {
    get: Method$OPTIONS_getInstance
  });
  Object.defineProperty(Method, 'HEAD', {
    get: Method$HEAD_getInstance
  });
  package$schema.Method = Method;
  package$schema.axios_ablvsw$ = axios;
  package$schema.getLinkByRel_h7hnh4$ = getLinkByRel;
  package$schema.getTargetSchemaByRel_h7hnh4$ = getTargetSchemaByRel;
  package$schema.getSchema_t1yf75$ = getSchema;
  Object.defineProperty(package$schema, 'REF_KEY', {
    get: function () {
      return REF_KEY;
    }
  });
  package$schema.defaultReplacer_5dbk7o$ = defaultReplacer;
  package$schema.replaceRef_c2ij6p$ = replaceRef;
  package$schema.resolveSchema_a5bukg$ = resolveSchema;
  package$schema.schemaObjectPath_61zpoe$ = schemaObjectPath;
  var package$ui = _.ui || (_.ui = {});
  var package$components = package$ui.components || (package$ui.components = {});
  var package$cards = package$components.cards || (package$components.cards = {});
  package$cards.CardRowProps = CardRowProps;
  package$cards.CardRow = CardRow;
  package$cards.cardRow_ds6rjt$ = cardRow;
  var package$login = package$components.login || (package$components.login = {});
  package$login.LoginProps = LoginProps;
  package$login.LoginState = LoginState;
  $$importsForInline$$['kotlin-react-dom'] = $module$kotlin_react_dom;
  package$login.Login = Login;
  package$login.login_ss14n$ = login;
  package$login.LoginButtonProps = LoginButtonProps;
  package$login.LoginButton = LoginButton;
  package$login.loginButton_k5937m$ = loginButton;
  package$login.PasswordProps = PasswordProps;
  package$login.PasswordInput = PasswordInput;
  package$login.passwordInput_k5937m$ = passwordInput;
  package$login.UsernameProps = UsernameProps;
  package$login.UsernameInput = UsernameInput;
  package$login.usernameInput_k5937m$ = usernameInput;
  var package$logo = package$components.logo || (package$components.logo = {});
  package$logo.logo_ss14n$ = logo;
  var package$questionnaire = package$components.questionnaire || (package$components.questionnaire = {});
  package$questionnaire.QuestionCardProps = QuestionCardProps;
  package$questionnaire.QuestionCard = QuestionCard;
  package$questionnaire.questionCard_rvrw3q$ = questionCard;
  package$questionnaire.QuestionnaireState = QuestionnaireState;
  package$questionnaire.Questionnaire = Questionnaire;
  var package$structural = package$ui.structural || (package$ui.structural = {});
  package$structural.About = About;
  package$structural.about_ss14n$ = about;
  package$structural.App = App;
  package$structural.app_ss14n$ = app;
  Object.defineProperty(package$structural, 'imgHouse', {
    get: function () {
      return imgHouse;
    }
  });
  Object.defineProperty(package$structural, 'imgMountain', {
    get: function () {
      return imgMountain;
    }
  });
  package$structural.Home = Home;
  package$structural.Body = Body;
  package$structural.home_ss14n$ = home;
  package$structural.body_ss14n$ = body;
  package$structural.Nav = Nav;
  package$structural.NavBrandCentralizer = NavBrandCentralizer;
  package$structural.navBrandCentralizer_ss14n$ = navBrandCentralizer;
  package$structural.nav_ss14n$ = nav;
  var package$various = _.various || (_.various = {});
  package$various.toJsonString_mzud1t$ = toJsonString;
  package$various.toJson_mzud1t$ = toJson;
  package$various.appName = appName;
  package$various.appHeader = appHeader;
  package$various.appIntroHeader = appIntroHeader;
  package$various.appIntroSubHeader = appIntroSubHeader;
  package$various.bodyHeader = bodyHeader;
  package$various.bodyWelcome = bodyWelcome;
  package$various.buttonTry = buttonTry;
  package$various.buttonLogin = buttonLogin;
  package$various.placeholderPassword = placeholderPassword;
  package$various.placeholderUsername = placeholderUsername;
  package$various.registration = registration;
  package$various.forgotPassword = forgotPassword;
  package$various.navHome = navHome;
  package$various.navContact = navContact;
  package$various.footerHeader = footerHeader;
  package$various.footerContent = footerContent;
  package$various.currentResultHeader = currentResultHeader;
  package$various.endResultHeader = endResultHeader;
  package$various.nextRequestHeader = nextRequestHeader;
  package$various.newQuestionnaire = newQuestionnaire;
  package$various.backToHome = backToHome;
  RemoteQuestionRepository.prototype.getNext_uk481n$ = QuestionRepository.prototype.getNext_uk481n$;
  questionRepo = new RemoteQuestionRepository();
  REF_KEY = '$ref';
  imgHouse = '/images/house-landscape-1.jpg';
  imgMountain = '/images/mountain-1.jpg';
  main([]);
  Kotlin.defineModule('hausbewerter-js', _);
  return _;
}(module.exports, require('kotlin'), require('kotlin-react-dom'), require('react-jsonschema-form'), require('react'), require('react-materialize'), require('react-router-dom'), require('axios'), require('kotlin-extensions'), require('kotlin-react'), require('react-dom')));

//# sourceMappingURL=hausbewerter-js.js.map
