export const menuItems = [
    {
      path: '/',
      name: 'MENU.HOME',
      nav: ['side'],
      meta: {
        title: 'MENU.HOME',
        icon: 'home',
        requiredAuth: true,
        permissions: ['ADMIN']
      }
    },
    {
      name: 'MENU.CUSTOMER',
      nav: ['side'],
      meta: {
        title: 'MENU.CUSTOMER',
        icon: 'account_circle',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/customers',
          name: 'MENU.CUSTOMERS',
          nav: ['side'],
          meta: {
            title: 'MENU.CUSTOMERS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/customers/create',
          name: 'MENU.CREATE_CUSTOMER',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_CUSTOMER',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.SUPPLIER',
      nav: ['side'],
      meta: {
        title: 'MENU.SUPPLIERS',
        icon: 'group',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/suppliers',
          name: 'MENU.SUPPLIERS',
          nav: ['side'],
          meta: {
            title: 'MENU.SUPPLIERS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/suppliers/create',
          name: 'MENU.CREATE_SUPPLIER',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_SUPPLIER',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.PRODUCT',
      nav: ['side'],
      meta: {
        title: 'MENU.PRODUCT',
        icon: 'store-outline',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/products',
          name: 'MENU.PRODUCTS',
          nav: ['side'],
          meta: {
            title: 'MENU.PRODUCTS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/products/create',
          name: 'MENU.CREATE_PRODUCT',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_PRODUCT',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    // {
    //   name: 'Features',
    //   nav: ['side'],
    //   meta: {
    //     title: 'Features',
    //     icon: 'store-outline',
    //     requiredAuth: true,
    //     permissions: ['ADMIN']
    //   },
    //   children: [
    //     {
    //       path: '/features',
    //       name: 'Features',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Features',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //     {
    //       path: '/features/create',
    //       name: 'Create Feature',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Create Feature',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //   ],
    // },
    // {
    //   name: 'Feature Group',
    //   nav: ['side'],
    //   meta: {
    //     title: 'Feature Groups',
    //     icon: 'store-outline',
    //     requiredAuth: true,
    //     permissions: ['ADMIN']
    //   },
    //   children: [
    //     {
    //       path: '/featuregroups',
    //       name: 'Feature Groups',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Feature Groups',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //     {
    //       path: '/featuregroups/create',
    //       name: 'Create Feature Group',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Create Feature Group',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //   ],
    // },
    {
      name: 'MENU.CATEGORY',
      nav: ['side'],
      meta: {
        title: 'MENU.CATEGORY',
        icon: 'category',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/category',
          name: 'MENU.CATEGORIES',
          nav: ['side'],
          meta: {
            title: 'MENU.CATEGORIES',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/category/create',
          name: 'MENU.CREATE_CATEGORY',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_CATEGORY',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.ORDER',
      nav: ['side'],
      meta: {
        title: 'MENU.ORDER',
        icon: 'shopping_cart',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/orders',
          name: 'MENU.ORDERS',
          nav: ['side'],
          meta: {
            title: 'MENU.ORDERS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/orders/create',
          name: 'MENU.CREATE_ORDER',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_ORDER',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.PO',
      nav: ['side'],
      meta: {
        title: 'MENU.PO',
        icon: 'shopping_cart',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/pos',
          name: 'MENU.POS',
          nav: ['side'],
          meta: {
            title: 'MENU.POS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/pos/create',
          name: 'MENU.CREATE_PO',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_PO',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.SHIPMENT',
      nav: ['side'],
      meta: {
        title: 'MENU.SHIPMENT',
        icon: 'local_shipping',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/shipments',
          name: 'MENU.SHIPMENTS',
          nav: ['side'],
          meta: {
            title: 'MENU.SHIPMENTS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/shipments/create',
          name: 'MENU.CREATE_SHIPMENT',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_SHIPMENT',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.PICKLISTS',
      nav: ['side'],
      meta: {
        title: 'MENU.PICKLISTS',
        icon: 'list_alt',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/picklists',
          name: 'MENU.PICKLISTS',
          nav: ['side'],
          meta: {
            title: 'MENU.PICKLISTS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.FACILITY',
      nav: ['side'],
      meta: {
        title: 'MENU.FACILITY',
        icon: 'warehouse',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/facilities',
          name: 'MENU.FACILITIES',
          nav: ['side'],
          meta: {
            title: 'MENU.FACILITIES',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/facilities/create',
          name: 'MENU.CREATE_FACILITY',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_FACILITY',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.ASSET',
      nav: ['side'],
      meta: {
        title: 'MENU.ASSET',
        icon: 'inventory',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/assets',
          name: 'MENU.ASSETS',
          nav: ['side'],
          meta: {
            title: 'MENU.ASSETS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/assets/create',
          name: 'MENU.CREATE_ASSET',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_ASSET',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'MENU.MANUFACTURING',
      nav: ['side'],
      meta: {
        title: 'MENU.MANUFACTURING',
        icon: 'factory',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/jobs',
          name: 'MENU.JOBS',
          nav: ['side'],
          meta: {
            title: 'MENU.JOBS',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/jobs/create',
          name: 'MENU.CREATE_JOB',
          nav: ['side'],
          meta: {
            title: 'MENU.CREATE_JOB',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    }
  ];
